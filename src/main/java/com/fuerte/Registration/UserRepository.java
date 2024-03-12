package com.fuerte.Registration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, Long> {
    @Query("{ 'email' : ?0 }")
    public User findByEmail(String email);
}