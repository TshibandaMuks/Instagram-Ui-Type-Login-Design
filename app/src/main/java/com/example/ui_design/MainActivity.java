package com.example.ui_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void facebookMessage(View v){
        Toast t = Toast.makeText(this,"Logging in with facebook...",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER_VERTICAL , 0,-1050);
      t.show();
    }

    public void loginMessage(View v){
        Toast t = Toast.makeText(this,"Logging in...",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER_VERTICAL , 0,-1050);
        t.show();
    }

    public void gettingHelpMessage(View v){
        Toast t = Toast.makeText(this,"Getting help signing in...",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER_VERTICAL , 0,-1050);
        t.show();
    }
}