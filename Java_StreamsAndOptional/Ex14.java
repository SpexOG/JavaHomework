package Java_StreamsAndOptional;

// Given a list of products with attributes: name, category, and price;
// find the category with the highest average price.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Ex14 {

    public static void main(String[] args) {

        List<Products> products = Arrays.asList(new Products("Cocos", "Fructe", 5), new Products("Strudel", "Patiserie", 10), new Products("Lego", "jucarii", 100), new Products("Car", "jucarii", 1), new Products("Bicycle", "jucarii", 1));

        Map<String, Double> sortedProducts = products.stream().collect(Collectors.groupingBy((Products::getCategory), Collectors.averagingDouble(Products::getPrice)));

        String highestAveragePrice = sortedProducts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No category found");

        System.out.println(highestAveragePrice);

    }

}

class Products {

    String name;
    String category;
    int price;

    public Products (String name, String category, int price){

        this.name=name;
        this.category=category;
        this.price=price;

    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

}
