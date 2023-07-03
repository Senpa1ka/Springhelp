package ru.gb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.model.Product;
import ru.gb.repository.ProductRepository;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/all")
    public String getProducts(Model model) {
        List<Product> products = productRepository.getAll();
        model.addAttribute("products", products);
        return "products";
    }
    @GetMapping("/{id}")
   public String getProductId(@RequestParam Long id, Model model) {
        List<Product> products = productRepository.findById(id);
        model.addAttribute("products", products);
        return "products";
    }


}
