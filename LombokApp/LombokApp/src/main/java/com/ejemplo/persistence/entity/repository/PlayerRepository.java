package com.ejemplo.persistence.entity.repository;

import com.ejemplo.persistence.entity.Player;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends ListCrudRepository<Player, Long> {
}
