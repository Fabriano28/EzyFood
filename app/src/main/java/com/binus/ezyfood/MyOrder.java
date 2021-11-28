package com.binus.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MyOrder extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    RVAdapter rvAdapter;
    public static List<String> listData;
//    private static Bundle state;
    int id2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        recyclerView = findViewById(R.id.RV);
        listData = new ArrayList<>();

        Bundle extras = getIntent().getExtras();
        id2 = extras.getInt("key2");

        if(id2 == 1){
            listData.add("Air Mineral");
        }else if(id2 == 2){
            listData.add("Jus Apel");
        }else if(id2 == 3){
            listData.add("Jus Mangga");
        }else if(id2 == 3){
            listData.add("Jus Alpukat");
        }

        for(int i = 0; i < 10; i++){
            String item = "Item";
            item = item + String.valueOf(i);
            listData.add(item);
        }

        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        rvAdapter = new RVAdapter(this, listData);
        recyclerView.setAdapter(rvAdapter);
        rvAdapter.notifyDataSetChanged();
    }

    public void pay(View view){
        Intent intent = new Intent(MyOrder.this, OrderComplete.class);
        startActivity(intent);
    }

    public void additems(View view){
        Intent intent = new Intent(MyOrder.this, Drinks.class);
        startActivity(intent);
    }

//    protected void onSaveInstanceState(Bundle state) {
//        super.onSaveInstanceState(state);
//
//        // Save list state
//        state = linearLayoutManager.onSaveInstanceState();
//        state.putParcelable(LIST_STATE_KEY, mListState);
//    }
}