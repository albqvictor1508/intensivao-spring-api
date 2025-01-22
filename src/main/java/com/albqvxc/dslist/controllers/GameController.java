package com.albqvxc.dslist.controllers;

import com.albqvxc.dslist.dto.GameMinDTO;
import com.albqvxc.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.albqvxc.dslist.entities.Game;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> games = gameService.findAll();
        return games;
    }
}