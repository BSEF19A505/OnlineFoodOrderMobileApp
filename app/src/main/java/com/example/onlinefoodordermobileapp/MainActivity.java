package com.example.onlinefoodordermobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void DisplayMenu(View view){
        Intent intent=new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void PlaceOrder(View view){
        final String MSG = com.example.onlinefoodordermobileapp.ORDER;
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText);
        EditText editText3 = findViewById(R.id.editText2);
        String message = editText1.getText()+", "
                        +editText2.getText()+" and "
                        + editText3.getText()+" added to Cart";
        Intent intent=new Intent(this,placeOrder.class);
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}