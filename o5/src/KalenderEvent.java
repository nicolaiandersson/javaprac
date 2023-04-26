/*
Øvelse 5
1. Opret en enum-type "Ugedag" med alle ugedage (Mandag, Tirsdag, Onsdag, Torsdag, Fredag, Lørdag, Søndag).
2. Opret en klasse "KalenderEvent" med attributterne titel, dato og ugedag.
3. Opret en testklasse, der instantierer et par KalenderEvent-objekter og udskriver dem i et læsbart format.
 */


public class KalenderEvent {
    private String title;
    private String date;
    private Ugedag weekday;

    public KalenderEvent(String title, String date, Ugedag weekday) {
        this.title = title;
        this.date = date;
        this.weekday = weekday;
    }

    public String toString() {
        return "Begivenhedstitel: " + title + " Dato: " + date + " Ugedag: " + weekday;
    }

    public static void main(String[] args) {
        KalenderEvent kalenderEvent = new KalenderEvent("Frokost", "28-05-2023", Ugedag.FREDAG);

        System.out.println(kalenderEvent);
    }
}
