package com.example.CallDropAnalyzer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ZoneProblematique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitude;
    private Double longitude;
    private String description; // Description de la zone (ex : "Zone avec faible couverture réseau")

    // Getters and Setters
}
