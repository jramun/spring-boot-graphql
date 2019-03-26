package com.jramun.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.jramun.graphql.domain.Product;
import com.jramun.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQuery implements GraphQLQueryResolver {
    @Autowired
    private ProductRepository productRepository;

    public Product findById(long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

}
