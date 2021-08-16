package com.codegym.repository;

import com.codegym.model.Product;
import com.codegym.model.Type;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository // đánh dấu @Repository tự động tiêm interface này vào Spring Container quản lý
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {

}

