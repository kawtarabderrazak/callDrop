package Controller;

import com.example.CallDropAnalyzer.Service.ReportService;
import com.example.CallDropAnalyzer.entities.CallDrop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/generate")
    public String generateReport(@RequestParam List<Long> callDropIds) {
        List<CallDrop> callDrops = // Récupérer les appels interrompus à partir des IDs
        return reportService.generateReport(callDrops);
    }
}
