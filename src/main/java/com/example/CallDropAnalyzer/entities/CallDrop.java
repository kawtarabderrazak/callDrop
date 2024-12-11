package com.example.CallDropAnalyzer.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class CallDrop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;
    private LocalDateTime callStartTime;
    private LocalDateTime callEndTime;
    private String dropCause; // Cause de l'interruption (par exemple, perte de signal, erreur de réseau)
    private Double latitude; // Latitude de l'emplacement de l'appel
    private Double longitude; // Longitude de l'emplacement de l'appel

    // Getters and Setters
}
