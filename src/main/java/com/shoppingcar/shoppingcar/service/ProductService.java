package com.shoppingcar.shoppingcar.service;

import com.shoppingcar.shoppingcar.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> fillAll(Pageable pageable);
    void remove(Long id);
    Product findById(Long id);
}
