package ru.gb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gb.model.Product;
import ru.gb.repository.ProductRepository;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    public ProductRepository productRepository;




    public void getAllProducts () {
        List<Product> products = productRepository.getAll();
        for (Product item : products ) {
            System.out.println(item.getId() + " " + item.getName());
        }
    }

}
