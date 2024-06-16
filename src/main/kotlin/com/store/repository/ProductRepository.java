package com.store.repository;

import com.store.model.Product;
import com.store.utils.DataBaseUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.store.utils.DataBaseUtil.storedMap;

@Component
public class ProductRepository {

    private final Map<Integer,Product> database = storedMap();

    public List<Product> getProduct(String type) {
       return database.values()
               .stream().filter((product -> product.getType().equals(type))).collect(Collectors.toList());
    }


    public Product save(Product product) {
        Map<Integer,Product> map = new HashMap<>();
        map.put(1,product);
        return product;
    }
}
