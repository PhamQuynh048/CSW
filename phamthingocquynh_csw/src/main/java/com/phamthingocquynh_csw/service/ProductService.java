package com.phamthingocquynh_csw.service;

import com.phamthingocquynh_csw.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product addProduct(Product product);
    Product sellProduct(Product product);
}
