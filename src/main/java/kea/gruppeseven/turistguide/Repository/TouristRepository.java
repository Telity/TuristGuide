package kea.gruppeseven.turistguide.Repository;

import kea.gruppeseven.turistguide.Model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

public class TouristRepository {
    private final List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository(){
        populateAttractions();
    }
    private void populateAttractions() {
        attractions.add(new TouristAttraction("Rundetårn","Højt tårn"));
        attractions.add(new TouristAttraction("Eiffel Tower", "Tower in paris"));
        attractions.add(new TouristAttraction("Lille havfrue","Figur"));
    }
}
