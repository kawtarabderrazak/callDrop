package Controller;

import com.example.CallDropAnalyzer.Service.ZoneProblematiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/zones")
public class ZoneProblematiqueController {

    @Autowired
    private ZoneProblematiqueService zoneProblematiqueService;

    @GetMapping("/all")
    public List<ZoneProblematique> getAllProblematicZones() {
        return zoneProblematiqueService.getAllProblematicZones();
    }

    // Autres méthodes pour l'affichage des zones
}
