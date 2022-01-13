package com.den.project.footballManager.service;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.FootballTeam;

import java.util.List;

public interface TeamService {
    List<FootballTeam> getAll();
    FootballTeam getById(Long teamId);
    FootballTeam getByPlayer(FootballPlayer footballPlayer);
    FootballTeam saveTeam(FootballTeam footballTeam);
}
