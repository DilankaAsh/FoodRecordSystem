package com.foodorder.dto;

/**
 * Define a customer order
 */
public class Order {

    Food foodItem;

    public void setFoodItem(Food foodItem) {
        this.foodItem = foodItem;
    }

    public Food getFoodItem() {
        return foodItem;
    }
}
