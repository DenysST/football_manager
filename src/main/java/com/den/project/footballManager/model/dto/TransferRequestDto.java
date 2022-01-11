package com.den.project.footballManager.model.dto;

import lombok.Data;

@Data
public class TransferRequestDto {
    private long playerId;
    private long teamId;
    private double commission;
}
