package com.foodorder.dto;

import java.math.BigDecimal;

/**
 * Define price of a food item
 */
public class Price {

    private BigDecimal value;
    private String currency;

    public Price(String currency, BigDecimal value) {

        this.currency = currency;
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
