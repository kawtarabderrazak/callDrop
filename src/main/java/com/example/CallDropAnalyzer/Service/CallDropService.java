package com.example.CallDropAnalyzer.Service;

import com.example.CallDropAnalyzer.repository.CallDropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallDropService {

    @Autowired
    private CallDropRepository callDropRepository;

    public List<CallDrop> getAllCallDrops() {
        return callDropRepository.findAll();
    }

    public List<CallDrop> getCallDropsByCause(String cause) {
        return callDropRepository.findByDropCause(cause);
    }

    public List<CallDrop> getCallDropsByLocation(Double latitude, Double longitude) {
        return callDropRepository.findByLatitudeAndLongitude(latitude, longitude);
    }

    // Autres méthodes de traitement des données
}
