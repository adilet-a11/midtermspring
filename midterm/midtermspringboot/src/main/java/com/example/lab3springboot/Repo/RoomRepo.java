package com.example.lab3springboot.Repo;

import com.example.lab3springboot.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room,Integer> {

}
