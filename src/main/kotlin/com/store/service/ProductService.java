package com.store.service;

import com.store.dto.GadgetType;
import com.store.dto.ProductDetails;
import com.store.dto.ProductId;
import com.store.model.Product;
import com.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductsOfType(GadgetType type) {
      return productRepository.getProduct(type.name());
    }

    public ProductId saveProduct(ProductDetails productDetails) {
        Product product = new Product(productDetails.getName(),
                productDetails.getType().name(),productDetails.getInventory(),5, productDetails.getCost());
        int id= productRepository.save(product).getId();
        return new ProductId(id);
    }
}
