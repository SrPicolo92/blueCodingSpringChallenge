package com.blueCodeSpringChallenge.blueCodeSpringChallenge.model;


import jakarta.persistence.*;

@Entity
public class exampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Name")
    private String name;
    @Column(name = "Email")
    private String email;
}
