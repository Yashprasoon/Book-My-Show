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
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    String  address;

    @ManyToOne
    ApplicationUsers owner;

    @OneToMany(mappedBy = "hall")
    List<Screen> screenList;

    @OneToMany(mappedBy = "hall")
    List<Shows> showsList;

    @OneToMany(mappedBy = "hall")
    List<Ticket> ticketList;







}
