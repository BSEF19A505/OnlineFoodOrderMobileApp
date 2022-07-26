package com.example.onlinefoodordermobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class placeOrder extends AppCompatActivity {

    public void CheckOut(View view){
        Intent intent=new Intent(this,CheckOut.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.MSG);
        TextView textView=findViewById(R.id.textView3);
        textView.setText(message);
    }
}