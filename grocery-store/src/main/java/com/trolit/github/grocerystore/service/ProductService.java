package com.trolit.github.grocerystore.service;

import com.trolit.github.grocerystore.dao.ProductDao;
import com.trolit.github.grocerystore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService(@Qualifier("fakeDao") ProductDao productDao) {
        this.productDao = productDao;
    }

    public int addProduct(Product product) {
        return productDao.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productDao.selectAllProducts();
    }
}