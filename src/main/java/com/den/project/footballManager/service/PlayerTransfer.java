package com.den.project.footballManager.service;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.dto.TransferRequestDto;

public interface PlayerTransfer {
    boolean transfer(TransferRequestDto dto);
}
