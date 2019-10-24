package com.example.assignment2_z5092257;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {
    private ArrayList<int[]> orderList;


    // Provide a suitable constructor (depends on the kind of dataset)
    public void setData(ArrayList<int[]> food) {
       this.orderList = food;
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView orderFoodname;
        public TextView costs;
        public TextView orderQuantity;
        public TextView subTotal;
        public TextView total;


        public OrderViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            orderFoodname = itemView.findViewById(R.id.order_foodName);
            costs = itemView.findViewById(R.id.order_itemCosts);
            orderQuantity = itemView.findViewById(R.id.order_quantity);
            subTotal=itemView.findViewById(R.id.order_subTotal);
            total=itemView.findViewById(R.id.order_total);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public OrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_item, parent, false);
        OrderViewHolder OrderViewHolder = new OrderViewHolder(view);

        return OrderViewHolder;

    }

    @Override
    public void onBindViewHolder(final OrderViewHolder holder, final int position) {
        int[] foodOrder = orderList.get(position);
        Food food = FoodDatabase.getFoodById(foodOrder[0]);
        int quantity = foodOrder[1];

        holder.orderFoodname.setText(food.getFoodname());
        holder.costs.setText("$" + food.getCosts());
        holder.orderQuantity.setText("x " +String.valueOf(quantity));
        holder.subTotal.setText("Subtotal: $" + String.valueOf(Math.round((food.getCosts() *quantity)*100.0)/100.0));


    }

    public int getItemCount(){
        return orderList.size();

    }




}

