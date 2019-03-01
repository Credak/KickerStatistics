package com.example.KickerStatistics.resource;

import com.example.KickerStatistics.entity.GameStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gamestatistics")
public class GameStatisticsResource {
    @Autowired
    com.example.KickerStatistics.repository.GameStatisticsRepository gameStatisticsRepository;

    @PostMapping("/add")
    public String addStatistics(@ModelAttribute GameStatistics gameStatistics){
        gameStatisticsRepository.save(gameStatistics);
        return "saveStatistics";
    }
}
