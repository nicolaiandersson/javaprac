import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ranking {

    private ArrayList<Athlete> ranking;

    public Ranking() {
        ranking = new ArrayList<>();
    }

    public void addAthlete(Athlete athlete) {
        ranking.add(athlete);
    }

    public ArrayList<Athlete> getRanking() {
        return ranking;
    }


}
