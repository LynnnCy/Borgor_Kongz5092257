package com.example.assignment2_z5092257;

public class Food {

    // unique identifier of an article
    private int foodID;

    // Title of the article
    private String foodname;

    // Short text to be displayed on main page
    private String summary;
    // Full text of the article
    private String allergens;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;

    private double costs;


    public Food (int foodID, String foodname, String summary, double costs,String allergens, int imageDrawableId) {
        this.foodID = foodID;
        this.foodname = foodname;
        this.summary = summary;
        this.allergens = allergens;
        this.costs=costs;
        this.imageDrawableId=imageDrawableId;
    }

    public int getfoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }


    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummmary(String summary) {
        this.summary = summary;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public int getFoodID() {
        return foodID;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public double getCosts(){
        return costs;
    }

    public void setCosts (double costs){
        this.costs=costs;
    }



}
