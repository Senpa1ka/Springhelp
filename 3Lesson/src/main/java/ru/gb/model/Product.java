package ru.gb.model;

public class Product {

    private static Long counter = 1L;

    private Long id;
    private String name;

    public Product(long l, String bread) {
        this.id = counter++;
        this.name = "Product #" + id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
