package com.store.utils;

import com.store.model.Product;

import java.util.HashMap;
import java.util.Map;

public class DataBaseUtil {

    public static Map<Integer, Product> storedMap() {
        Map<Integer,Product> database= new HashMap<>();
        Product gadget = new Product("Phone","gadget",2,1,200);
        Product food = new Product("Dosa","food",3,2,200);
        Product book = new Product("Book","book",4,3,200);
        Product other = new Product("Bat","other",5,4,200);
        database.put(1,gadget);
        database.put(2,food);
        database.put(3,book);
        database.put(4,other);
        return database;
    }
}
