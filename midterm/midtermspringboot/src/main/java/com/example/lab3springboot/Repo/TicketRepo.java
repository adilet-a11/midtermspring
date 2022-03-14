package com.example.lab3springboot.Repo;

import com.example.lab3springboot.entity.Room;
import com.example.lab3springboot.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {

}

