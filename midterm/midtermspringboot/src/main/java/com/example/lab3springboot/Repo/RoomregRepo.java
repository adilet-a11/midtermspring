package com.example.lab3springboot.Repo;


import com.example.lab3springboot.entity.Room_reg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomregRepo extends JpaRepository<Room_reg,Integer> {


}