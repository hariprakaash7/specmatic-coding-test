package com.store.controllers;

import com.store.dto.GadgetType;
import com.store.dto.ProductDetails;
import com.store.dto.ProductId;
import com.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class Products {

    ProductService productService;

    @Autowired
    Products(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/products")
    public List<com.store.model.Product> data(@RequestParam(required = false, defaultValue = "other") GadgetType type) {
        return productService.getProductsOfType(type);
    }

    @PostMapping(value = "/products")
    public ResponseEntity<ProductId> product(@RequestBody @Valid ProductDetails productDetails) {
       return ResponseEntity.status(201).body(productService.saveProduct(productDetails));
    }
}
