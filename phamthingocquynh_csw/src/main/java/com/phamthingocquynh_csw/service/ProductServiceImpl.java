package com.phamthingocquynh_csw.service;

import com.phamthingocquynh_csw.entity.Product;
import com.phamthingocquynh_csw.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product sellProduct(Product p) {
        return productRepo.save(p);
    }
}
