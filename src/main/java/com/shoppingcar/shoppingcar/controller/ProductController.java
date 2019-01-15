package com.shoppingcar.shoppingcar.controller;

import com.shoppingcar.shoppingcar.model.Product;
import com.shoppingcar.shoppingcar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public ModelAndView viewHome(Pageable pageable) {
        Page<Product> products;
        products = productService.fillAll(pageable);
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}
