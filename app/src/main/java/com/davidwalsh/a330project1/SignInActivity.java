package com.davidwalsh.a330project1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends Activity {

    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        email = (EditText) findViewById(R.id.emailText);
        password = (EditText) findViewById(R.id.passwordText);

        configureSignInButton();
    }

    void configureSignInButton() {
        Button signInButton = (Button) findViewById(R.id.signInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailS = email.getText().toString();
                String passwordS = password.getText().toString();
                if (emailS.equals("admin") && passwordS.equals("a")) {
                    startActivity(new Intent(SignInActivity.this, ContentsActivity.class));
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Email or password not recognized",
                            Toast.LENGTH_SHORT);

                    toast.show();
                }


            }
        });
    }
    @Override
    public void onBackPressed()
    {
        //do nothing
    }
}