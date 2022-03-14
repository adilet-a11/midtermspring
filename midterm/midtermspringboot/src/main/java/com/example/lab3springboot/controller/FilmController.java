package com.example.lab3springboot.controller;
import com.example.lab3springboot.Repo.*;
import com.example.lab3springboot.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
@Controller
public class FilmController {
    @Autowired
    RoomRepo roomRepo;
    @Autowired
    FilmRepo filmRepo;

    @Autowired
    RoomregRepo roomregRepo;

    @Autowired
    TicketRepo ticketRepo;

    @GetMapping("/films")
    public String showFIlm(Model model){

        List<Room_reg>room_regs=roomregRepo.findAll();
        model.addAttribute("room_regs",room_regs );

        return "films";
    }



    public String showFIl(Model model){

        List<Ticket>tickets=ticketRepo.findAll();
        model.addAttribute("room_regs",tickets );

        return "film";
    }
}
