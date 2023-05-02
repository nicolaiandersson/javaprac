import java.util.Comparator;

public class AthleteTimeComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return Double.compare(o1.getTime(),o2.getTime());
    }
}
