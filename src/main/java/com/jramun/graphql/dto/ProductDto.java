package com.jramun.graphql.dto;

import com.jramun.graphql.domain.Product;


public class ProductDto {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        return p;
    }
}
