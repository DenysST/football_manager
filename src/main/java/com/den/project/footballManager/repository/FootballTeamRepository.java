package com.den.project.footballManager.repository;

import com.den.project.footballManager.model.FootballPlayer;
import com.den.project.footballManager.model.FootballTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootballTeamRepository extends JpaRepository<FootballTeam, Long> {
    FootballTeam findFootballTeamByFootballPlayer(FootballPlayer footballPlayer);
}
