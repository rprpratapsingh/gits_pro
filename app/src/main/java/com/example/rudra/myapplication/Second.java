package com.example.rudra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t = (TextView) findViewById(R.id.editText3);
        t.setText("Hello, "+getIntent().getStringExtra("message"));
    }
}
