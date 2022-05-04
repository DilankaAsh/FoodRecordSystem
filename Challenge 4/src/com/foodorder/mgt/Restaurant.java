package com.foodorder.mgt;

import com.foodorder.dto.Food;
import com.foodorder.dto.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Define and manage a restaurant
 */
public class Restaurant {

    private static final String DELIMITER = ",";

    private Map<String, Food> foodItems =  new HashMap<>();
    private String name;

    public Restaurant(String name, List<Food> foodList) {
        this.name = name;
        for(Food food : foodList) {
            foodItems.put(food.getName(), food);
        }
    }

    /**
     * Print the receipt for the given order
     *
     * @param order order
     */
    public void printReceipt(Order order) {
        Food food = order.getFoodItem();
        StringBuilder builder = new StringBuilder().append(name).append(DELIMITER).append(food.getName())
                .append(DELIMITER).append(food.getPrice().getCurrency()).append(food.getPrice().getValue());
        System.out.println(builder.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Food> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(Map<String, Food> foodItems) {
        this.foodItems = foodItems;
    }
}
