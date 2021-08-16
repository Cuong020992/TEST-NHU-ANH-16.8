package com.codegym.service.product;

import com.codegym.model.Product;
import com.codegym.model.Type;
import com.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service // đánh dấu @Service tự động tiêm interface này vào Spring Container quản lý
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }


    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }



}