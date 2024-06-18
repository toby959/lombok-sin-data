package com.ejemplo.persistence.entity.repository;

import com.ejemplo.persistence.entity.Ability;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepository extends ListCrudRepository<Ability, Long> {
}
