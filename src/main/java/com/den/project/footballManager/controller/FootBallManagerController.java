package com.den.project.footballManager.controller;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.FootballTeam;
import com.den.project.footballManager.model.dto.TransferRequestDto;
import com.den.project.footballManager.service.InjectData;
import com.den.project.footballManager.service.PlayerService;
import com.den.project.footballManager.service.PlayerTransfer;
import com.den.project.footballManager.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manager")
@AllArgsConstructor
public class FootBallManagerController {
    private final PlayerService playerService;
    private final TeamService teamService;
    private final PlayerTransfer playerTransfer;
    private final InjectData injectData;

    @RequestMapping("/teams")
    public List<FootballTeam> getAllTeams() {
        return teamService.getAll();
    }

    @RequestMapping("/teamPlayers/{teamId}")
    public List<FootballPlayer> getAllTeamPlayers(@PathVariable Long teamId) {
        return playerService.getPlayersByTeamId(teamId);
    }

    @RequestMapping("/transfer")
    public Boolean doTransfer(TransferRequestDto dto) {
        return playerTransfer.transfer(dto);
    }

    @GetMapping("/inject")
    public void inject() {
        injectData.inject();
    }
}
