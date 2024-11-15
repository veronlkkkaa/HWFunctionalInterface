package org.example.Predicate;

import org.example.Product;
import org.example.ProductDB;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {


    public static void main(String[] args) {
        List<Product> list = getList(ProductDB.products, product -> product.getPrice()<300);
        List<Product> list1 = getList(ProductDB.products,product -> !product.isAvailable());
        List<Product> list2 = getList(ProductDB.products,product -> product.getName().startsWith("A"));
        System.out.println(list);
        System.out.println();
        System.out.println(list1);
        System.out.println();
        System.out.println(list2);
    }


    public static List<Product> getList(List<Product> list, Predicate<Product> predicate){
        List<Product> newList = new ArrayList<>();
        for(Product product : list){
            if(predicate.test(product)){
                newList.add(product);
            }
        }
        return newList;
    }



}