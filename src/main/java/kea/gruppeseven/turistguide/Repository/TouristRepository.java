package kea.gruppeseven.turistguide.Repository;

import kea.gruppeseven.turistguide.Model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TouristRepository {
    private final List<TouristAttraction> attractions = new ArrayList<>();
    private int id;
    public TouristRepository(){
        populateAttractions();
    }
    private void populateAttractions() {
        attractions.add(new TouristAttraction("Rundetårn","Højt tårn"));
        attractions.add(new TouristAttraction("Eiffel Tower", "Tower in paris"));
        attractions.add(new TouristAttraction("Lille havfrue","Figur"));
    }

    public List<TouristAttraction> getAllAttractions() {
        return attractions;
    }


    public TouristAttraction getAttractionByName(String name) {
        for (TouristAttraction touristAttraction : attractions) {
            if (touristAttraction.getName().equals(name)) {
                return touristAttraction;
            }
        }
        return null;
    }

    public TouristAttraction addAttraction(TouristAttraction attraction) {
            attractions.add(attraction);
            return attraction;
    }

    public TouristAttraction updateAttraction(TouristAttraction attraction) {
        int index = attractions.indexOf(attraction);
        attractions.set(index, attraction);
        return attraction;
    }

    public TouristAttraction deleteAttraction(TouristAttraction attraction) {
        attractions.remove(attraction);
        return attraction;
    }



}
