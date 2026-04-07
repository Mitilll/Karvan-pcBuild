package com.Karvan.pcbuid.repository;

import com.Karvan.pcbuid.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
