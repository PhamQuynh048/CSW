package com.phamthingocquynh_csw.Dto;

import com.phamthingocquynh_csw.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {
    Product convertToEntity(ProductDto productDto);
    ProductDto convertToDto(Product productEntity);
}
