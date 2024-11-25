package DesignPatterns_Java;

import java.util.HashMap;
import java.util.Map;

interface PricingStrategy {

    double TotalCost(Map<String, Integer> items, Map<String, Double> prices);

}

class RegularPricing implements PricingStrategy {

    @Override
    public double TotalCost(Map<String, Integer> items, Map<String, Double> prices) {
        double total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            total = total + entry.getValue() * prices.get(entry.getKey());
        }
        return total;
    }

}

class DiscountPricing implements PricingStrategy {

    private double discountRate;

    public DiscountPricing(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double TotalCost(Map<String, Integer> items, Map<String, Double> prices) {
        double total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            total = total + entry.getValue() * prices.get(entry.getKey());
        }
        return total * (1 - discountRate);
    }

}

class HolidayPricing implements PricingStrategy {

    private double holidayRate;

    public HolidayPricing(double holidayRate) {
        this.holidayRate = holidayRate;
    }

    @Override
    public double TotalCost(Map<String, Integer> items, Map<String, Double> prices) {
        double total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            total = total + entry.getValue() * prices.get(entry.getKey());
        }
        return total * holidayRate;
    }

}

class ShoppingCart{

    private Map<String, Integer> items = new HashMap<>();
    private PricingStrategy pricingStrategy;

    private Map<String, Double> prices;

    public ShoppingCart(Map<String, Double> prices) {
        this.prices = prices;
    }

    public void addItem(String itemName, int quantity) {
        items.put(itemName, items.getOrDefault(itemName, 0) + quantity);
    }

    public void setPricingStrategy(PricingStrategy strategy) {
        this.pricingStrategy = strategy;
    }

    public double calculateTotal() {
        if (pricingStrategy == null) {
            throw new IllegalStateException("Pricing strategy not set.");
        }
        return pricingStrategy.TotalCost(items, prices);
    }

}

public class StrategyPattern {

    public static void main(String[] args) {

        Map<String, Double> prices = new HashMap<>();
        prices.put("Apple", 2.0);
        prices.put("Banana", 1.5);
        prices.put("Orange", 3.0);

        ShoppingCart cart = new ShoppingCart(prices);

        cart.addItem("Apple", 5);
        cart.addItem("Banana", 3);

        cart.setPricingStrategy(new RegularPricing());
        System.out.println("Regular Pricing Total: $" + cart.calculateTotal());

        cart.setPricingStrategy(new DiscountPricing(0.20));
        System.out.println("Discount Pricing Total: $" + cart.calculateTotal());

        cart.setPricingStrategy(new HolidayPricing(0.5));
        System.out.println("Holiday Pricing Total: $" + cart.calculateTotal());

    }

}
