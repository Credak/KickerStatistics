package com.example.KickerStatistics.repository;

import com.example.KickerStatistics.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
