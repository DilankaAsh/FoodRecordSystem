package com.foodorder.mgt;

import com.foodorder.dto.Food;
import com.foodorder.dto.Order;
import com.foodorder.dto.Price;

import java.math.BigDecimal;
import java.util.*;

/**
 * Manage the customer orders
 */
public class OrderManager {

    private Map<String, List<Restaurant>> restaurants = new HashMap<String, List<Restaurant>>() {{
        put("pepperoni pizza", Arrays.asList(new Restaurant("Awesome pizza place",
                Arrays.asList(new Food("pepperoni pizza", new Price("$", new BigDecimal(20)))))));
        put("burger", Arrays.asList(new Restaurant("Wild burger joint",
                Arrays.asList(new Food("burger", new Price("$", new BigDecimal(15)))))));
    }};

    /**
     * Handle customer order for the provided food name
     *
     * @param foodName food name
     */
    public void handleOrder(String foodName) {

        Restaurant restaurant = selectRestaurant(foodName);
        Order order = new Order();
        order.setFoodItem(restaurant.getFoodItems().get(foodName));
        restaurant.printReceipt(order);
    }

    /**
     * Select a restaurant for the given food name
     *
     * @param foodName food name
     * @return restaurant
     */
    private Restaurant selectRestaurant(String foodName) {

        List<Restaurant> availableRestaurants = restaurants.get(foodName);
        return restaurants.get(foodName).get(new Random().nextInt(availableRestaurants.size()));
    }
}
