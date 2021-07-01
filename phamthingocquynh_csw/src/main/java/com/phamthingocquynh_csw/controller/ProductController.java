package com.phamthingocquynh_csw.controller;

import com.phamthingocquynh_csw.Dto.MapperDto;
import com.phamthingocquynh_csw.Dto.ProductDto;
import com.phamthingocquynh_csw.entity.Product;
import com.phamthingocquynh_csw.model.BaseResponse;
import com.phamthingocquynh_csw.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    MapperDto mapperDto;

    @GetMapping
    public ResponseEntity getProduct(){
        BaseResponse res = new BaseResponse();
        res.data = productService.getAllProducts();
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createProduct(@RequestBody Product product){
        BaseResponse res = new BaseResponse();
        res.data = productService.addProduct(product);
        return ResponseEntity.ok(res);
    }

    @PutMapping("/{id}")
    public ResponseEntity sellProduct(@PathVariable("id") int id, @RequestBody ProductDto productDto){
        Product p = mapperDto.convertToEntity(productDto);
        p.setId(id);
        Product data = productService.sellProduct(p);
        BaseResponse res = new BaseResponse();
        res.data = data;
        return ResponseEntity.ok(res);
    }
}
