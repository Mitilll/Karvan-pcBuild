package com.Karvan.pcbuid.repository;

import com.Karvan.pcbuid.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
