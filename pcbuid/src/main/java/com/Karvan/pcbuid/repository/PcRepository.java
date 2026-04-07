package com.Karvan.pcbuid.repository;

import com.Karvan.pcbuid.model.Pc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PcRepository extends MongoRepository<Pc, String> {
}
