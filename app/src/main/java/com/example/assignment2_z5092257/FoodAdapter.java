package com.example.assignment2_z5092257;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.UserViewHolder> {
    private ArrayList<Food> foodList;


    // Provide a suitable constructor (depends on the kind of dataset)
    public void setData(ArrayList<Food> food) {
        this.foodList = food;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView foodname;
        public TextView fooddes;
        public TextView costs;
        public ImageView foodimage;



        public UserViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            foodname = itemView.findViewById(R.id.food_name);
            fooddes = itemView.findViewById(R.id.food_shortd);
            costs = itemView.findViewById(R.id.item_cost);
            foodimage = itemView.findViewById(R.id.food_image);


        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_item, parent, false);
        UserViewHolder userViewHolder = new UserViewHolder(view);

        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(final UserViewHolder holder, final int position) {
        final Food foodAtPosition = foodList.get(position);

        holder.fooddes.setText(foodList.get(position).getSummary());
        holder.costs.setText("$" + (foodList.get(position).getCosts()));

        holder.foodname.setText(foodList.get(position).getFoodname());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext().getApplicationContext(), FoodDetailActivity.class);
                intent.putExtra("FoodID", foodAtPosition.getfoodID());
                view.getContext().startActivity(intent);
            }
        });

        holder.foodimage.setImageResource(foodAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }


}

