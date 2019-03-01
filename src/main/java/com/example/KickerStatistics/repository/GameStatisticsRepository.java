package com.example.KickerStatistics.repository;

import com.example.KickerStatistics.entity.GameStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameStatisticsRepository extends JpaRepository<GameStatistics, Integer> {
}
