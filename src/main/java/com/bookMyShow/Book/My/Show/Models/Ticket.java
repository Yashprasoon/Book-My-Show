package com.bookMyShow.Book.My.Show.Models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @ManyToOne
    ApplicationUsers user;

    @ManyToOne
    Movie movie;

    @ManyToOne
    Hall hall;

    @ManyToOne
    Shows show;




}
