package com.example.KickerStatistics.resource;

import com.example.KickerStatistics.entity.Game;
import com.example.KickerStatistics.entity.Team;
import com.example.KickerStatistics.entity.Users;
import com.example.KickerStatistics.repository.GameRepository;
import com.example.KickerStatistics.repository.TeamRepository;
import com.example.KickerStatistics.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/game")
public class GameResource {
    @Autowired
    GameRepository gameRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public String getGame(Model model) {
        model.addAttribute("game", gameRepository.findAll());
        return "game";
    }

    @GetMapping(value = "/addteam")
    public String addTeam(Model model) {
        List<Users> users = new ArrayList<>();
        Team team = new Team();

        usersRepository.findAll().iterator().forEachRemaining(users::add);
        team.setUsersList(users);

        model.addAttribute("team", team);
        model.addAttribute("users", team.getUsersList());
        return "addteam";
    }

    @PostMapping(value = "/addteam")
    public String addTeam(@ModelAttribute Team team, Model model) {
        List<Users> usersListTeam1 = new ArrayList<>();
        List<Users> usersListTeam2 = new ArrayList<>();
        List<Team> teamList = new ArrayList<>();
        int i = 0;

        Team team1 = new Team();
        Team team2 = new Team();
        for (Users users : team.getUsersList()) {
            if ((i % 2) == 0) {
                usersListTeam1.add(users);
                i++;
            } else {
                usersListTeam2.add(users);
                i++;
            }
        }
        team1.setUsersList(usersListTeam1);
        team2.setUsersList(usersListTeam2);
        teamList.add(team1);
        teamList.add(team2);

        teamRepository.saveAll(teamList);
        model.addAttribute("team", team);
        model.addAttribute("team1", team1.getUsersList());
        model.addAttribute("team2", team2.getUsersList());
        return "addteamresult";
    }

    @PostMapping(value = "/add")
    public String addGame(@ModelAttribute Game game) {
        gameRepository.save(game);
        return "addGame";
    }
}
