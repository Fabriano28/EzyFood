package com.binus.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
    }

    public void toMyOrder3(View view){
        Intent intent = new Intent(Drinks.this, MyOrder.class);
        startActivity(intent);
    }

    public void drink1(View view){
        Intent intent = new Intent(Drinks.this, Order.class);
        intent.putExtra("key", 1);
        startActivity(intent);
    }

    public void drink2(View view){
        Intent intent = new Intent(Drinks.this, Order.class);
        intent.putExtra("key", 2);
        startActivity(intent);
    }

    public void drink3(View view){
        Intent intent = new Intent(Drinks.this, Order.class);
        intent.putExtra("key", 3);
        startActivity(intent);
    }

    public void drink4(View view){
        Intent intent = new Intent(Drinks.this, Order.class);
        intent.putExtra("key", 4);
        startActivity(intent);
    }
}