package com.example.AthleteOS.Model;

import jakarta.persistence.*;

@Entity
public class ClubCoach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Club club;

    @ManyToOne
    private Coach coach;

    @Enumerated(EnumType.STRING)
    private Role role;

    private Boolean activo = true;

}
