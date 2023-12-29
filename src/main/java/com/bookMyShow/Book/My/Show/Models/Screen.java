package com.bookMyShow.Book.My.Show.Models;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String screenName;
    int screenCapacity;
    boolean status;
    String type; // 2d, 3d , 4d

    @ManyToOne
    Hall hall;





}
