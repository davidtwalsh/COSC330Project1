package com.davidwalsh.a330project1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureNextButton();
    }

    void configureNextButton()
    {
        timer = new Timer();
        // Set the schedule function
        timer.scheduleAtFixedRate(new TimerTask() {
                                      @Override
                                      public void run() {
                                          //Log.d("zzoop","zzzzzoooooop");
                                          moveToSignIn();
                                      }
                                  },
                4000, 4000);   // 1000 Millisecond  = 1 second
    }
    void moveToSignIn()
    {
        timer.cancel();
        startActivity(new Intent(MainActivity.this,SignInActivity.class));
    }
}
