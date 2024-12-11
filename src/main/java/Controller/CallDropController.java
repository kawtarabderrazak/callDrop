package Controller;

import com.example.CallDropAnalyzer.Service.CallDropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/call-drops")
public class CallDropController {

    @Autowired
    private CallDropService callDropService;

    @GetMapping("/all")
    public List<CallDrop> getAllCallDrops() {
        return callDropService.getAllCallDrops();
    }

    @GetMapping("/by-cause")
    public List<CallDrop> getCallDropsByCause(@RequestParam String cause) {
        return callDropService.getCallDropsByCause(cause);
    }

    @GetMapping("/by-location")
    public List<CallDrop> getCallDropsByLocation(@RequestParam Double latitude, @RequestParam Double longitude) {
        return callDropService.getCallDropsByLocation(latitude, longitude);
    }
}
