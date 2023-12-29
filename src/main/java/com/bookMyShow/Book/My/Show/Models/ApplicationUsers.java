package com.bookMyShow.Book.My.Show.Models;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ApplicationUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    String name;
    @Column(unique = true)
    String email;
    @Column(unique = true)
    long phone_num;
    String password;
    String type; //Movie owners, hall owners, regular owners
    int age;


}
