package com.den.project.footballManager.service;

import com.den.project.footballManager.model.FootballPlayer;

import java.util.List;

public interface PlayerService {
    FootballPlayer getPlayer(Long id);
    List<FootballPlayer> getPlayersByTeamId(Long id);
}
