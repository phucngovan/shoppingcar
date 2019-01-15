package com.shoppingcar.shoppingcar.repository;

import com.shoppingcar.shoppingcar.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
}
