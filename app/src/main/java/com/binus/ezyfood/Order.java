package com.binus.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class Order extends AppCompatActivity {
    public String iddrink = "";
//    HashMap<String, Integer> drinkdata = new HashMap<String, Integer>();
//    HashMap<String, String> drinkname = new HashMap<String, String>();
    int id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

//        drinkdata.put("d01", 3000);
//        drinkdata.put("d02", 4000);
//        drinkdata.put("d03", 5000);
//        drinkdata.put("d04", 6000);
//
//        drinkname.put("d01", "Air Mineral");
//        drinkname.put("d02", "Jus Apel");
//        drinkname.put("d03", "Jus Mangga");
//        drinkname.put("d04", "Jus Alpukat");

        Bundle extras = getIntent().getExtras();
        id = extras.getInt("key");


        TextView nama = (TextView) findViewById(R.id.drinknama);
        TextView harga = (TextView) findViewById(R.id.drinkharga);

        if(id == 1){
            nama.setText("Air Mineral");
            harga.setText("3000");
        }else if(id == 2){
            nama.setText("Jus Apel");
            harga.setText("4000");
        }else if(id == 3){
            nama.setText("Jus Mangga");
            harga.setText("5000");
        }else if(id == 4){
            nama.setText("Jus Alpukat");
            harga.setText("6000");
        }


    }

    public int calculate (int id, int count){
        int total = 0;

        if(id == 1){
            total = count * 3000;
        }else if(id == 2){
            total = count * 4000;
        }else if(id == 3){
            total = count * 5000;
        }else if(id == 4){
            total = count * 6000;
        }


        return total;
    }

    public void toMyOrder2(View view){
        Intent intent = new Intent(Order.this, MyOrder.class);
        startActivity(intent);
    }

    public void additem(View view){
        Intent intent = new Intent(Order.this, MyOrder.class);
        intent.putExtra("key2", id);
        startActivity(intent);
    }

    public void moreitem(View view){
        Intent intent = new Intent(Order.this, Drinks.class);
        startActivity(intent);
    }



}