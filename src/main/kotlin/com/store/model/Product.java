package com.store.model;

public class Product {

    private int id;

    private String name;

    private String type;

    private int inventory;

    private int cost;

    public Product(String name, String type, int inventory,int id, int cost) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.inventory = inventory;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public int getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }
}
