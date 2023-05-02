import java.util.ArrayList;
import java.util.Collections;

public class Athlete {
    private String name;
    private double time;

    public Athlete(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String toString() {
        return "Name: " + name + ", Time: " + time;
    }

    public double getTime() {
        return time;
    }

    public static void main(String[] args) {
        Ranking ranking = new Ranking();

        Athlete a1 = new Athlete("Karl", 12.4);
        Athlete a2 = new Athlete("Børge", 22.7);
        Athlete a3 = new Athlete("Jens", 10.2);


        ranking.addAthlete(a1);
        ranking.addAthlete(a2);
        ranking.addAthlete(a3);

        //before sort

        for(Athlete a : ranking.getRanking()) {
            System.out.println(a);
        }

        Collections.sort(ranking.getRanking(),new AthleteTimeComparator());

        int place = 0;
        //after sort
        for(Athlete a : ranking.getRanking()) {
            place ++;
            System.out.println("Place number: " + place + ", " + a);
        }





    }



}
