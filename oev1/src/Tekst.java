/*
Øvelse 1
1. Lav en klasse Tekst med attributten tekstLinjer (det skal
være en liste der kan indeholde tekststrenge).
2. Tilføj en metode ”tilføj”, der kan tilføje en tekststreng til listen af
tekstlinjer.
3. Tilføj en metode ”findAntalUnikke”, der returnerer antallet af
unikke tekstlinjer i listen.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class Tekst {
    private ArrayList<String> tekstLinjer;

    public Tekst() {
        tekstLinjer = new ArrayList<>();
    }


    public void tilføj(String tekst) {
        tekstLinjer.add(tekst);
    }

    public int findAntalUnikke() {
        HashSet<String> unikke = new HashSet<>(tekstLinjer);
        return unikke.size();
    }



    public static void main(String[] args) {
        Tekst tekst = new Tekst();

        tekst.tilføj("Dette er en test.");
        tekst.tilføj("Dette er en test.");
        tekst.tilføj("Dette er en tes121242t.");
        tekst.tilføj("Dette er en te32932st.");

        System.out.println("Der er: " + tekst.findAntalUnikke() + " unikke strings");

    }
}
