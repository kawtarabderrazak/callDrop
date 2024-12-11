package com.example.CallDropAnalyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CallDropRepository extends JpaRepository<CallDrop, Long> {
    List<CallDrop> findByDropCause(String cause);
    List<CallDrop> findByLatitudeAndLongitude(Double latitude, Double longitude);
}
