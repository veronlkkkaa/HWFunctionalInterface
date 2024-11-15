package org.example.Supplier;

import org.example.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        List<Product> emptyList = newSupplierList(100, () -> new Product());
        List<Product> constructorList = newSupplierList(100,Product::new);
        System.out.println(emptyList);
        System.out.println(constructorList);
    }


    public  static List<Product> newSupplierList(int count, Supplier<Product> supplier) {
        List<Product> list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list.add(supplier.get());
        }
        return list;
    }
}
