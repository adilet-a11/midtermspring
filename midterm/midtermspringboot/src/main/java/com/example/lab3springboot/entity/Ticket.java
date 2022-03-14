package com.example.lab3springboot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticket_id;


    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "room_id",referencedColumnName="room_id")
    // private Room room;



    public Integer getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(Integer ticket_id) {
        this.ticket_id = ticket_id;
    }



    //  public Room getRoom() {
    //      return room;
    //  }





    //  public void setRoom(Room room) {
    //      this.room = room;
    //  }


}
