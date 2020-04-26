package com.arturtarcisio.workshopmongo.repository;

import com.arturtarcisio.workshopmongo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
