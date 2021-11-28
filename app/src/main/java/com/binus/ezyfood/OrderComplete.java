package com.binus.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);
    }

    public void mainmenu(View view){
        Intent intent = new Intent(OrderComplete.this, MainActivity.class);
        startActivity(intent);
    }
}