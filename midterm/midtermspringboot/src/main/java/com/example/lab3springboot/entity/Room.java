package com.example.lab3springboot.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Integer id;

    @Column(length = 45,nullable = false,unique = true)
    private String room_number;

    @OneToMany
    private List<Film>films;
    public Integer getRoom_id() {
        return id;
    }

    public void setRoom_id(Integer room_id) {
        this.id = room_id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }


    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
