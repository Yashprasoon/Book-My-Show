package com.bookMyShow.Book.My.Show.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String actorName;
    String directorName;
    String actressName;
    int IMDBRating;
    double duration;

    @ManyToOne
    ApplicationUsers owner;

    @OneToMany(mappedBy = "movie")
    List<Ticket> ticketList;




}
