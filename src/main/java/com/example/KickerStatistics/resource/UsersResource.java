package com.example.KickerStatistics.resource;

import com.example.KickerStatistics.entity.Users;
import com.example.KickerStatistics.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersResource {
    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value="/all")
    public String getAll(Model model){
        model.addAttribute("userslist", usersRepository.findAll());
        return "userslist";
    }
    @GetMapping(value="/add")
    public String addUser(Model model){
        model.addAttribute("users", new Users());
        return "users";
    }
    @PostMapping("/add")
    public String userSubmit(@ModelAttribute Users users){
        usersRepository.save(users);
        return "result";
    }
}
