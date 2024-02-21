package com.marcuslull.mbyapisec.repository;


import com.marcuslull.mbyapisec.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}