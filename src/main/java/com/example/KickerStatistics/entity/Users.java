package com.example.KickerStatistics.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "vorname")
    private String vorname;
    @Column(name = "nachname")
    private String nachname;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    @OneToMany(mappedBy = "player")
    private List<GameStatistics> gameStatistics;


    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<GameStatistics> getGameStatistics() {
        return gameStatistics;
    }

    public void setGameStatistics(List<GameStatistics> gameStatistics) {
        this.gameStatistics = gameStatistics;
    }
}
