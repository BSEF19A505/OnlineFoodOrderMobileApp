package com.example.onlinefoodordermobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CheckOut extends AppCompatActivity {


    public void OrderConfirmed(View view){
        EditText editText1 = findViewById( R.id.editText3);
        String msg1=editText1.getText().toString();

    EditText editText2 = findViewById( R.id.editText5);
    String msg2=editText2.getText().toString();
    EditText editText3 = findViewById( R.id.editText7);
    String msg3=editText3.getText().toString();
    EditText editText4 = findViewById( R.id.editText4);
    String msg4=editText4.getText().toString();
    EditText editText5 = findViewById( R.id.editText6);
    String msg5=editText5.getText().toString();
        if(msg1.isEmpty()){
            Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show();

        }else if(msg2.isEmpty()){
            Toast.makeText(this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
        }else if(msg3.isEmpty()){
            Toast.makeText(this, "Enter Email Address", Toast.LENGTH_SHORT).show();
        }else if(msg4.isEmpty()){
            Toast.makeText(this, "Enter Address", Toast.LENGTH_SHORT).show();
        }else if(msg5.isEmpty()){
            Toast.makeText(this, "Enter Payment Method i.e. Cash on Deleivery, Easypaisa", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(this, orderConfirmed.class);
            startActivity(intent);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        Intent intent=getIntent();
    }
}