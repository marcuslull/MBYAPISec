package com.marcuslull.mbyapisec.repository;

import com.marcuslull.mbyapisec.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByEmail(String email);
}