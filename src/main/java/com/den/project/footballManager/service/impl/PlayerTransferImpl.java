package com.den.project.footballManager.service.impl;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.dto.TransferRequestDto;
import com.den.project.footballManager.service.PlayerService;
import com.den.project.footballManager.service.PlayerTransfer;
import com.den.project.footballManager.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerTransferImpl implements PlayerTransfer {
    private final PlayerService playerService;
    private final TeamService teamService;

    @Override
    public boolean transfer(TransferRequestDto dto) {
        FootballPlayer currentPlayer = playerService.getPlayer(dto.getPlayerId());
        double transferPrice = currentPlayer.getExperience() * 100000 / currentPlayer.getAge();
        double commission = transferPrice * dto.getCommission();
        return false;
    }

    
}
