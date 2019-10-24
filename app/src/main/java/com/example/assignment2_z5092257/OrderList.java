package com.example.assignment2_z5092257;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class OrderList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TextView total;
    private double totalAmount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_order);

            total= findViewById(R.id.order_total);
            recyclerView = findViewById(R.id.rv_order);
            layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            OrderAdapter orderAdapter = new OrderAdapter();
            orderAdapter.setData(MainActivity.al);
            recyclerView.setAdapter(orderAdapter);

            for (int i=0; i<MainActivity.al.size();i++){
                int[]food =MainActivity.al.get(i);
                Food food2 = FoodDatabase.getFoodById(food[0]);
                int quantity=food[1];
                totalAmount+=quantity*food2.getCosts();

            }
            total.setText("Total Amount is $ "+String.valueOf(totalAmount));


            }


    }








