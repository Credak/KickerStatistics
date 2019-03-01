package com.example.KickerStatistics.resource;

import com.example.KickerStatistics.entity.Team;
import com.example.KickerStatistics.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/team")
public class TeamResource {
    @Autowired
    TeamRepository teamRepository;


    @PostMapping("/add")
    public String addTeam(@ModelAttribute Team team){
        teamRepository.save(team);
        return "addTeam";
    }
}
