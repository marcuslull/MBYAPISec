package com.marcuslull.mbyapisec.repository;

import com.marcuslull.mbyapisec.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findUserByEmail(String email);
}