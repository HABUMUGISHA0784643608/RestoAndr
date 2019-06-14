package com.example.restoappl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bLogin;
    EditText etEmail;
    EditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bLogin =(Button) findViewById(R.id.bLogin);
        etEmail=(EditText) findViewById(R.id.etemail);
        etPassword=(EditText) findViewById(R.id.etPassword);
        bLogin.setOnClickListener (this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:
                startActivity(new Intent(this,NavigationDrawer.class));
                break;
        }
    }
}
