package com.example.KickerStatistics.entity;

import javax.persistence.*;

@Entity
public class GameStatistics {

    @GeneratedValue
    @Id
    private Integer id;


    @Column(name = "position")
    private String position;

    @Column(name = "score")
    private int score;

    @Column(name = "won")
    private boolean won;

    @ManyToOne
    @JoinColumn(name="player_id", referencedColumnName = "id")
    private Users player;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Game game;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public Users getPlayer() {
        return player;
    }

    public void setPlayer(Users player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
