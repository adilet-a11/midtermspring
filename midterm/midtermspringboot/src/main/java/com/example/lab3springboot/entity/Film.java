package com.example.lab3springboot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer film_id;

    @Column(length = 45,nullable = false,unique = true)
    private String name;

    @OneToMany
    private List<Room> room;
    public Film(Integer film_id){
        this.film_id=film_id;
    }
    public Film(String name){
        this.name = name;
    }

    public Film(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int film_id) {
        this.film_id = film_id;
    }

    public int getId() {
        return film_id;
    }


}
