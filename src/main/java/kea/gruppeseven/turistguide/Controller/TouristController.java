package kea.gruppeseven.turistguide.Controller;

import kea.gruppeseven.turistguide.Model.TouristAttraction;
import kea.gruppeseven.turistguide.Service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/attractions")
public class TouristController {
    public final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> getAllAttractions() {
        List<TouristAttraction> attractions = touristService.getAllAttractions();
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getAttraction(@PathVariable String name) {
        TouristAttraction attraction = touristService.getAttractionbyName(name);
        return new ResponseEntity<>(attraction, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction attraction) {
        TouristAttraction  attraction1 = touristService.addAttraction(attraction);
        return new ResponseEntity<>(attraction1, HttpStatus.CREATED);
    }
    @PostMapping("/update")


    @PostMapping("/delete/{name}")

}
