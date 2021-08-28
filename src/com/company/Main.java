package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        // HashMap task
        HashMap<String, Double> productInfo = new HashMap<String, Double>();

        productInfo.put("Audi", 0.5);
        productInfo.put("BMW", 0.25);
        productInfo.put("Mazda", 1.0);
        productInfo.put("Volvo", 3.5);
        productInfo.put("Tesla", 3.3);
        productInfo.put("Lada", 1.1);
        productInfo.put("VW", 1.2);
        productInfo.put("Saab", 1.0);

        int counter = 0;
        for (Double price : productInfo.values()) {
            if (price <= 1.0) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " items 1EUR or less.");

        double minPrice = productInfo.get("Audi");
        for (Double price : productInfo.values()) {
            if (price <= minPrice) {
                minPrice = price;
            }
        }
        System.out.println("The cheapest price is: " + minPrice);

        double maxPrice = productInfo.get("Audi");
        for (Double price : productInfo.values()) {
            if (price >= maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("The most expensive price is: " + maxPrice);

        HashMap<String, Double> anotherListOfProducts = new HashMap<>();

        anotherListOfProducts.put("Audi", 3.7);
        anotherListOfProducts.put("Opel", 1.5);
        anotherListOfProducts.put("Renault", 4.4);

        anotherListOfProducts.putAll(productInfo);
        System.out.println("Total amount of products: " + anotherListOfProducts.size());

        ArrayList<Double> productPricesSorted = new ArrayList<>();

        productPricesSorted.addAll(anotherListOfProducts.values());
        Collections.sort(productPricesSorted);

        System.out.println("Prices in ascending order: " + productPricesSorted);
        System.out.println();

        // HashTable task
        Hashtable<String, Double> productList = new Hashtable<>();

        productList.put("Audi", 0.5);
        productList.put("BMW", 0.25);
        productList.put("Mazda", 1.0);
        productList.put("Volvo", 3.5);
        productList.put("Tesla", 3.3);
        productList.put("Lada", 1.1);
        productList.put("VW", 1.2);
        productList.put("Saab", 1.0);

        counter = 0;
        for (Double price : productList.values()) {
            if (price <= 1.0) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " items 1EUR or less.");

        minPrice = productList.get("Audi");
        for (Double price : productList.values()) {
            if (price <= minPrice) {
                minPrice = price;
            }
        }
        System.out.println("The cheapest price is: " + minPrice);

        maxPrice = productList.get("Audi");
        for (Double price : productList.values()) {
            if (price >= maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("The most expensive price is: " + maxPrice);

        HashMap<String, Double> anotherList = new HashMap<>();

        anotherList.put("Audi", 3.7);
        anotherList.put("Opel", 1.5);
        anotherList.put("Renault", 4.4);

        anotherList.putAll(productList);
        System.out.println("Total amount of products: " + anotherList.size());

        ArrayList<Double> productsSorted = new ArrayList<>();

        productsSorted.addAll(anotherList.values());
        Collections.sort(productsSorted);

        System.out.println("Prices in ascending order: " + productsSorted);




    }
}
