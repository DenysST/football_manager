package com.den.project.footballManager.service.impl;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.FootballTeam;
import com.den.project.footballManager.repository.FootballPlayerRepository;
import com.den.project.footballManager.repository.FootballTeamRepository;
import com.den.project.footballManager.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {
    private final FootballTeamRepository footballTeamRepository;
    @Override
    public List<FootballTeam> getAll() {
        return footballTeamRepository.findAll();
    }

    public FootballTeam getById(Long teamId) {
        return footballTeamRepository.getById(teamId);
    }
}
