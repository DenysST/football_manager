package com.den.project.footballManager.repository;

import com.den.project.footballManager.model.FootballPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootballPlayerRepository extends JpaRepository<FootballPlayer, Long> {
}
