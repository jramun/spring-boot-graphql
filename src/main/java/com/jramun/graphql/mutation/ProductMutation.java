package com.jramun.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.jramun.graphql.domain.Product;
import com.jramun.graphql.dto.ProductDto;
import com.jramun.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMutation implements GraphQLMutationResolver {

    private ProductRepository productRepository;

    @Autowired
    public ProductMutation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product insert(ProductDto dto) {
        return this.productRepository.save(dto.getProduct());
    }

    public Product put(ProductDto dto) {
        return this.productRepository.save(dto.getProduct());
    }

    public boolean delete(int id) {
        productRepository.delete(productRepository.findById(id).get());
        return true;
    }


}
