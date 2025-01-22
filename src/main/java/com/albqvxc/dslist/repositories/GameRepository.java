package com.albqvxc.dslist.repositories;

import com.albqvxc.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}