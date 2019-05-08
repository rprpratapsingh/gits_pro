package com.example.rudra.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_list;
    private RecyclerView.Adapter second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_list = (RecyclerView) findViewById(R.id.rv_list);
        String[] mDataset = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven"};
        second = new Second(mDataset);
        rv_list.setAdapter(second);
    }
}
