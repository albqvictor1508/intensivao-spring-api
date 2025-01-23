package com.albqvxc.dslist.services;

import com.albqvxc.dslist.dto.GameDTO;
import com.albqvxc.dslist.dto.GameMinDTO;
import com.albqvxc.dslist.projections.GameMinProjection;
import com.albqvxc.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.albqvxc.dslist.entities.Game;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(game -> new GameMinDTO(game)).toList();
    }

    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(game -> new GameMinDTO(game)).toList();
    }
}