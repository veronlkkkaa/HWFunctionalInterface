package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    public static List<Product> products = new ArrayList<Product>();

    static {
        ProductDB.products.add(new Product("Apple", 100, true));
        ProductDB.products.add(new Product("Banana", 60, true));
        ProductDB.products.add(new Product("Orange", 80, false));
        ProductDB.products.add(new Product("Milk", 150, true));
        ProductDB.products.add(new Product("Bread", 50, true));
        ProductDB.products.add(new Product("Cheese", 300, false));
        ProductDB.products.add(new Product("Chicken", 500, true));
        ProductDB.products.add(new Product("Rice", 200, true));
        ProductDB.products.add(new Product("Sugar", 90, false));
        ProductDB.products.add(new Product("Salt", 40, true));
        ProductDB.products.add(new Product("Butter", 250, false));
        ProductDB.products.add(new Product("Eggs", 120, true));
    }


}
