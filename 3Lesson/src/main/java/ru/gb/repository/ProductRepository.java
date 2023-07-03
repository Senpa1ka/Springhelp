package ru.gb.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import ru.gb.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {
private List<Product> products;

       @PostConstruct
    public void init() {
           products = new ArrayList<>(Arrays.asList(
              new Product(1l , "bread"),
                   new Product(2l , "apple"),
                   new Product(3l , "orange")
           ));
       }

       public List<Product> findById(long id) {
           return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException());
       }

       public List<Product> getAll() {
           return new ArrayList<Product>(products);
       }

    }


