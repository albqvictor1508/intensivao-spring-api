package com.albqvxc.dslist.controllers;

import com.albqvxc.dslist.dto.GameDTO;
import com.albqvxc.dslist.dto.GameMinDTO;
import com.albqvxc.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{gameId}")
    public GameDTO findById(@PathVariable Long gameId) {
        return gameService.findById(gameId);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}