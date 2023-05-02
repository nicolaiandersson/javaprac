import java.util.Comparator;

public class catLivesComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o2.getNumberOfLives(),o1.getNumberOfLives());
    }
}
