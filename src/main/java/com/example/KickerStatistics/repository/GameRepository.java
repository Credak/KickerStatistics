package com.example.KickerStatistics.repository;

import com.example.KickerStatistics.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
