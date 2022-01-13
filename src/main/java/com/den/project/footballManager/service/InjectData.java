package com.den.project.footballManager.service;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.FootballTeam;
import com.den.project.footballManager.repository.FootballPlayerRepository;
import com.den.project.footballManager.repository.FootballTeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class InjectData {
    private final FootballPlayerRepository footballPlayerRepository;
    private final FootballTeamRepository footballTeamRepository;


    public void inject() {
        FootballPlayer Ronaldo = footballPlayerRepository
                .save(new FootballPlayer(null, "Cris", "Ronaldo", 30, 100));
        FootballPlayer Messi = footballPlayerRepository
                .save(new FootballPlayer(null, "Leo", "Messi", 32, 140));
        FootballPlayer Test1 = footballPlayerRepository
                .save(new FootballPlayer(null, "test1", "test1", 30, 100));
        FootballPlayer Test2 = footballPlayerRepository
                .save(new FootballPlayer(null, "test2", "test2", 30, 100));
        FootballPlayer Test3 = footballPlayerRepository
                .save(new FootballPlayer(null, "test3", "test3", 30, 100));
        FootballPlayer Test4 = footballPlayerRepository
                .save(new FootballPlayer(null, "test4", "test4", 30, 100));

        footballTeamRepository.save(new FootballTeam(null, "Barsa", 1000000000,
                List.of(Messi, Test1, Test2)));
        footballTeamRepository.save(new FootballTeam(null, "Real", 1000000000,
                List.of(Ronaldo, Test3, Test4)));

    }

}
