package com.example.style;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends Activity {
    //Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tb = findViewById(R.id.tool_bar);
        //setActionBar(tb);
    }
}