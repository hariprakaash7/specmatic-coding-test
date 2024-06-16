package com.store.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.store.config.StringDeserializer;

import javax.validation.constraints.NotNull;


public class ProductDetails {
    @JsonProperty("name")
    @NotNull
    @JsonDeserialize(using = StringDeserializer.class)
    String name;

    @JsonProperty("type")
    @NotNull
    GadgetType type;

    @JsonProperty("inventory")
    @NotNull
    Integer inventory;

    @JsonProperty("cost")
    @NotNull
    Integer cost;

    ProductDetails() {
    }

    ProductDetails(String name,GadgetType type,Integer inventory,Integer cost) {
        this.name = name;
        this.type = type;
        this.inventory = inventory;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public GadgetType getType() {
        return type;
    }

    public Integer getInventory() {
        return inventory;
    }

    public Integer getCost() {
        return cost;
    }
}
