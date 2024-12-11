package com.example.CallDropAnalyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZoneProblematiqueRepository extends JpaRepository<ZoneProblematique, Long> {
    List<ZoneProblematique> findAll();
}
