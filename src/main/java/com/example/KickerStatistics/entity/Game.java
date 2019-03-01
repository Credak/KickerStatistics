package com.example.KickerStatistics.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Game {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "timestamp")
    private Timestamp timeStamp;

    @OneToMany(mappedBy = "game")
    private List<Team> teamList;

    @OneToOne(mappedBy = "game")
    private GameStatistics gameStatistics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public GameStatistics getGameStatistics() {
        return gameStatistics;
    }

    public void setGameStatistics(GameStatistics gameStatistics) {
        this.gameStatistics = gameStatistics;
    }
}
