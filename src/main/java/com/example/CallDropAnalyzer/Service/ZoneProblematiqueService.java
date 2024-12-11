package com.example.CallDropAnalyzer.Service;

import com.example.CallDropAnalyzer.repository.ZoneProblematiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneProblematiqueService {

    @Autowired
    private ZoneProblematiqueRepository zoneProblematiqueRepository;

    public List<ZoneProblematique> getAllProblematicZones() {
        return zoneProblematiqueRepository.findAll();
    }

    // Méthodes supplémentaires pour identifier les zones problématiques
}
