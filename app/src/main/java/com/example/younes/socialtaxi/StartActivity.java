package com.example.younes.socialtaxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    private EditText emailUser ;
    private EditText password ;
    private Button btnSignin ;
    private Button btnCreatAccount ;
    private Button btnForgetPassword ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnCreatAccount = (Button) findViewById(R.id.loginbtnCreatAccount);
        btnForgetPassword= (Button) findViewById(R.id.loginbtnFOrgetPassword);


        //fonction switch you in register activity

        btnCreatAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this , RegisterActivity.class);
                StartActivity.this.startActivity(intent);
            }
        });

        //fonction switch you in main activity

        btnForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this , MainActivity.class);
                StartActivity.this.startActivity(intent);
            }
        });
    }



}
