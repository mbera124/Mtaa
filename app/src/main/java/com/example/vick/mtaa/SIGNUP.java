package com.example.vick.mtaa;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SIGNUP extends AppCompatActivity {
    private Button btnregister,btnback;
    private EditText etemail,etpassword,etname,etphone;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //initializing firebase auth object
        auth = FirebaseAuth.getInstance();
        btnregister = findViewById(R.id.btnregister);
        btnback = findViewById(R.id.btnback);
        etemail = findViewById(R.id.etemail);
        etpassword = findViewById(R.id.etpassword);
        etphone = findViewById(R.id.etphone);
        etname = findViewById(R.id.etname);


        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(SIGNUP.this, UserDashboardActivity.class));
            finish();
        }
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etemail.getText().toString();
                String phone = etphone.getText().toString();
                String name = etname.getText().toString();
                final String password = etpassword.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter E-Mail address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(getApplicationContext(), "Enter Phone Number!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(getApplicationContext(), "Enter full Name!", Toast.LENGTH_SHORT).show();
                    return;
                }
                //creating a new user
                auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(SIGNUP.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                //succes
                                Toast.makeText(SIGNUP.this,"USER CREATED"+task.isSuccessful(),Toast.LENGTH_SHORT).show();

                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        etpassword.setError(getString(R.string.minimum_password));
                                    } else {
                                        Toast.makeText(SIGNUP.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                                    }
                                } else {
                                    Intent intent = new Intent(SIGNUP.this, UserDashboardActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SIGNUP.this, LOGIN.class));
            }

        });
    }
}
