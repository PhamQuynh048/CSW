package com.phamthingocquynh_csw.repository;

import com.phamthingocquynh_csw.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
