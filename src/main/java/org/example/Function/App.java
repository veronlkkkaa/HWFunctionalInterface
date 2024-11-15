package org.example.Function;

import org.example.Product;
import org.example.ProductDB;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        List<Integer> productsPrice = getNewList(ProductDB.products, product -> product.getPrice());
        List<String> productsName = getNewList(ProductDB.products,product -> product.getName());
        System.out.println(productsPrice);
        System.out.println();
        System.out.println(productsName);
    }

    public static <R> List<R>  getNewList(List<Product> list, Function<Product,R> function) {
        List<R> products = new ArrayList<>();
        for (Product product : list) {
            products.add(function.apply(product));
        }
        return products;
    }
}
