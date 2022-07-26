package com.example.onlinefoodordermobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.onlinefoodordermobileapp.ORDER";
    public void DisplayMenu(View view){
        Intent intent=new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void PlaceOrder(View view){
        Intent intent = new Intent(this, placeOrder.class);
        EditText editText1 = findViewById(R.id.editText1);
        String text1=editText1.getText().toString();
        if(text1.isEmpty()){
            Toast.makeText(this, "Enter Item", Toast.LENGTH_SHORT).show();
        }else {


            String message = editText1.getText().toString() + " added to Cart";


            intent.putExtra(MSG, message);

            startActivity(intent);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=getIntent();
    }
}