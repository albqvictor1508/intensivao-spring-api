package com.albqvxc.dslist.services;

import com.albqvxc.dslist.entities.GameList;
import com.albqvxc.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.albqvxc.dslist.dto.GameListDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(gameList -> new GameListDTO(gameList)).toList();
    }
}
