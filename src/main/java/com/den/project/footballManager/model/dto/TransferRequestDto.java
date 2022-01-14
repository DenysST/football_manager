package com.den.project.footballManager.model.dto;

import lombok.Data;

@Data
public class TransferRequestDto {
    private Long playerId;
    private Long teamId;
    private Double commission;
}
