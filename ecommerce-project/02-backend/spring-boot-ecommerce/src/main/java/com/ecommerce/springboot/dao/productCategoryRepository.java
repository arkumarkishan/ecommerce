package com.ecommerce.springboot.dao;


import com.ecommerce.springboot.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface productCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
