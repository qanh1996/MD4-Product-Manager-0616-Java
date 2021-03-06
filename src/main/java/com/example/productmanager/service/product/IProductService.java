package com.example.productmanager.service.product;

import com.example.productmanager.model.Product;
import com.example.productmanager.service.IGeneralService;


public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAllByNameContaining(String name);

    Iterable<Product> findAllByOrderByPriceAsc();

    Iterable<Product> findTop4New();

    Iterable<Product> findProductByCategoryId(Long id);

    Iterable<Product> findAllByPriceBetween(int from, int to);
}
