/*
Øvelse 16
1. Opret en klasse "WashingMachine" med attributterne temparature,
isExpressWash og en ArrayList af log. Tilføj en konstruktør for at initialisere attributterne.
2. Tilføj en metode "start", der starter vaskemaskinen og
returnerer den estimerede varighed af vaskecyklussen baseret på temperatur og isExpressWash.
Metoden skal også registrere startdatoen for hver vask i loggen.
3. Opret en testklasse med en main-metode, der instantierer et WashingMachine-objekt,
starter vaskemaskinen flere gange og udskriver den estimerede varighed af hver vask
 samt udskriver loggen med startdatoerne for hver vask.
 */

import java.time.LocalDate;
import java.util.ArrayList;

public class WashingMachine {
    private int temperature;
    private boolean isExpressWash;
    private ArrayList<LocalDate> log;

    public WashingMachine(int temperature, boolean isExpressWash) {
        this.temperature = temperature;
        this.isExpressWash = isExpressWash;
    }

    public int start() {
        LocalDate date = LocalDate.now();
        log.add(date);

        if (temperature == 20) {
            return 0;
        }
        return 0;
    }
}