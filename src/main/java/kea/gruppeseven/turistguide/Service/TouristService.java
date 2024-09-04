package kea.gruppeseven.turistguide.Service;

import kea.gruppeseven.turistguide.Model.TouristAttraction;
import kea.gruppeseven.turistguide.Repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    public final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAllAttractions() {
        return touristRepository.getAllAttractions();
    }

    public TouristAttraction getAttractionbyName(String name) {
        return touristRepository.getAttractionByName(name);
    }

    public TouristAttraction addAttraction(TouristAttraction attraction) {
        return touristRepository.addAttraction(attraction);
    }

    public TouristAttraction updateAttraction(TouristAttraction attraction) {
        return touristRepository.updateAttraction(attraction);
    }

    public TouristAttraction deleteAttraction(TouristAttraction attraction) {
        return touristRepository.deleteAttraction(attraction);
    }
}
