package com.bookMyShow.Book.My.Show.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int availableTickets;
    Date startTime;
    Date endTime;
    int ticketPrice;

    @ManyToOne
    Hall hall;

    @ManyToOne
    Movie movie;

    @ManyToOne
    Screen screen;

    @OneToMany(mappedBy = "show")
    List<Ticket> ticketList;
}
