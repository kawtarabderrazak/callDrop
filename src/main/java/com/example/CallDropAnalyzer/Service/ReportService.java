package com.example.CallDropAnalyzer.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    public String generateReport(List<CallDrop> callDrops) {
        // Logique pour générer un rapport des appels interrompus
        return "Rapport sur les appels interrompus";
    }
}
