package Controller;

import ch.qos.logback.core.model.Model;
import com.example.CallDropAnalyzer.Service.MapService;
import com.example.CallDropAnalyzer.entities.CallDrop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/map")
public class MapController {

    @Autowired
    private MapService mapService;

    @GetMapping("/visualization")
    public String getCallDropMap(Model model) {
        List<CallDrop> callDrops = // Appeler le service pour obtenir les données des appels interrompus
                String mapData = mapService.generateMapVisualization(callDrops);
        model.addAttribute("mapData", mapData);
        return "callDropMapView"; // Vue Thymeleaf ou autre
    }
}
