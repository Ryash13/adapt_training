package io.assignment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.assignment.Model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
