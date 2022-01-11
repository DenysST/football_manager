package com.den.project.footballManager.service.impl;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.repository.FootballPlayerRepository;
import com.den.project.footballManager.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final FootballPlayerRepository footballPlayerRepository;

    @Override
    public FootballPlayer getPlayer(Long id) {
        return footballPlayerRepository.getById(id);
    }
}
