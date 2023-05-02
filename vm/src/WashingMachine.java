import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class WashingMachine {
    private int temparature;
    private boolean isExpressWash;
    private ArrayList<LocalDate> log = new ArrayList<>();


    public WashingMachine(int temparature, boolean isExpressWash) {
        this.temparature = temparature;
        this.isExpressWash = isExpressWash;
    }

    public int start() {
        LocalDate date = LocalDate.now();
        log.add(date);
        if (isExpressWash) {
            return 20;
        } else if (temparature == 30 || temparature == 40){
            return 90;
        } else {
            return 120;
        }


    }



    public static void main(String [] args) {
        WashingMachine washingMachine = new WashingMachine(60, false);

        System.out.println(washingMachine.start());
        System.out.println(washingMachine.start());
        System.out.println(washingMachine.start());
        System.out.println(washingMachine.start());
        System.out.println(washingMachine.start());
        System.out.println(washingMachine.start());
        System.out.println(washingMachine.start());
        System.out.println(washingMachine.log);

    }
}