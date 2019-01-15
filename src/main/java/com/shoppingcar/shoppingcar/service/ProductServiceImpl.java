package com.shoppingcar.shoppingcar.service;

import com.shoppingcar.shoppingcar.model.Product;
import com.shoppingcar.shoppingcar.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> fillAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
