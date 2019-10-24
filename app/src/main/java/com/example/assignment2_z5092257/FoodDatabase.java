package com.example.assignment2_z5092257;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {


    /***
     * Retrieves an Article object using the provided id.
     */
    public static Food getFoodById(int foodID) {
        return food.get(foodID);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Food> food = new HashMap<>();

    static {


        food.put(1, new Food(
                1,
                "Single Pretzel Bacon KING",
                "100% Beef Pattie, Smokey bacon, Cheese,Creamy Mayo.",
                18.20,
                "Allergens: Egg, Milk, Soy and Wheat.",
                R.drawable.food1

        ));
        food.put(2, new Food(
                2,
                "Double Pretzel Bacon KING",
                "100% Beef Pattie, Smokey bacon, Cheese,Creamy Mayo",
                20.50,
                "Allergens: Egg, Milk, Soy and Wheat.",
                R.drawable.food2

        ));

        food.put(3, new Food(
                3,
                "Impossible Whopper",
                "juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles",
                21.50,
                "Allergens: Egg, Soy and Wheat.",
                R.drawable.food3

        ));

        food.put(4, new Food(
                4,
                "Triple Stacker KING",
                " flame-grilled 100% beef, topped with smoky bacon, melted American cheese.",
                22.50,
                "Allergens: Egg, Milk, Soy and Wheat.",
                R.drawable.food4

        ));

        food.put(5, new Food(
                5,
                "Double Stacker KING",
                " flame-grilled 100% beef, topped with smoky bacon, melted American cheese",
                20.50,
                "Allergens: Egg, Milk, Soy and Wheat.",
                R.drawable.food5
                ));

        food.put(6, new Food(
                        6,
                        "Single Stacker KING",
                        "flame-grilled 100% beef, topped with smoky bacon, melted American cheese",
                        18.50,
                "Allergens: Egg, Milk, Soy and Wheat.",
                R.drawable.food6

                        ));
        food.put(7, new Food(
                7,
                "Double Quarter Pound KING",
                "flame-grilled 100% beef, topped with American cheese, freshly sliced onions, zesty pickles, ketchup.",
                20.00,
                "Allergens: Milk, Soy and Wheat.",
                R.drawable.food7

        ));

        food.put(8, new Food(
                8,
                "Bacon KING",
                "Two flame–grilled 100% beef patties topped with thick-cut smoked bacon, melted American cheese, ketchup and creamy may",
                20.90,
                "Allergens: Egg, Milk, Soy and Wheat.",
                R.drawable.food8

        ));

        food.put(9, new Food(
                9, "Whopper",
                "flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles. ",
                16.90,
                "Allergens: Egg, Soy and Wheat.",
                R.drawable.food9

        ));
        food.put(10, new Food(
                10,
                "Quarter Pound KING",
                " flame-grilled 100% beef topped with American cheese, freshly sliced onions, zesty pickles, ketchup ",
                20.90,
                "Allergens: Milk, Soy and Wheat.",
                R.drawable.food10

        ));

        food.put(11, new Food(
                11,
                "BBQ Bacon Whopper",
                "fire-grilled beef, topped with thick-cut smoked bacon, melted American cheese, freshly cut iceberg lettuce, creamy mayo. ",
                18.90,
                "Allergens: Egg, Milk, Soy and Wheat.",
                R.drawable.food10

        ));

        food.put(12, new Food(
                12,
                "Double Whopper ",
                "flame-grilled beef patties topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup.",
                22.90,
                "Allergens: Egg, Soy and Wheat.",
                R.drawable.food12

        ));

        food.put(13, new Food(
                13,
                "Whopper JR",
                " flame-grilled beef patty topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles.",
                20.00,
                "Allergens: Egg, Soy and Wheat.",
                R.drawable.food13

        ));

        food.put(14, new Food(
                14,
                "Bacon & Cheese Whopper",
                " flame-grilled beef topped with thick-cut smoked bacon, melted American cheese, ripe tomatoes, fresh lettuce, creamy mayonnaise.",
                22.50,
                "Allergens: Egg, Soy and Wheat.",
                R.drawable.food14

        ));

        food.put(15, new Food(
                15,
                "Hamburger",
                "beef patty topped with a simple layer of crinkle cut pickles, yellow mustard, and ketchup.",
                16.50,
                "Allergens: Soy and Wheat.",
                R.drawable.food15

        ));

        food.put(16, new Food(
                16,
                "Cheeseburger",
                "beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup.",
                16.50,
                "Allergens: Milk, Soy and Wheat",
                R.drawable.food16

        ));


    }
}
