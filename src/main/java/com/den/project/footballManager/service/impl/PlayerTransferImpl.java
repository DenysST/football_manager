package com.den.project.footballManager.service.impl;

import com.den.project.footballManager.exception.TeamBalanceException;
import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.FootballTeam;
import com.den.project.footballManager.model.dto.TransferRequestDto;
import com.den.project.footballManager.service.PlayerService;
import com.den.project.footballManager.service.PlayerTransfer;
import com.den.project.footballManager.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class PlayerTransferImpl implements PlayerTransfer {
    private final PlayerService playerService;
    private final TeamService teamService;

    @Override
    @Transactional
    public boolean transfer(TransferRequestDto dto) {
        FootballPlayer currentPlayer = playerService.getPlayer(dto.getPlayerId());
        FootballTeam currentPlayerTeam = teamService.getByPlayer(currentPlayer);
        FootballTeam newPlayerTeam = teamService.getById(dto.getTeamId());
        double transferPrice = (double) currentPlayer.getExperience() * 1000 / currentPlayer.getAge();
        double priceWithCommission = transferPrice + (transferPrice * dto.getCommission());
        if (newPlayerTeam.getMoneyBalance() >= priceWithCommission) {
            newPlayerTeam.setMoneyBalance(newPlayerTeam.getMoneyBalance() - priceWithCommission);
            currentPlayerTeam.setMoneyBalance(currentPlayerTeam.getMoneyBalance() + priceWithCommission);
            currentPlayerTeam.getFootballPlayer().remove(currentPlayer);
            newPlayerTeam.getFootballPlayer().add(currentPlayer);
            teamService.saveTeam(currentPlayerTeam);
            teamService.saveTeam(newPlayerTeam);
            return true;

        }
        throw new TeamBalanceException("Team doesn't have anouth money");
    }


}
