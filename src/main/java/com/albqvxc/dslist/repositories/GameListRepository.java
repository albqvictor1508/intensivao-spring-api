package com.albqvxc.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.albqvxc.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
