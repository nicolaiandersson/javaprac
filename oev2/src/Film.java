/*
Øvelse 2
1. Lav en klasse Film med attributter for filmtitel og udgivelsesår.
2. Tilføj en konstruktør der modtager en filmtitel og et udgivelsesår og
en anden konstruktør der kun modtager filmtitel og selv sætter
udgivelsesåret til det aktuelle år.
3. Tilføj en klasse Producer, og giv Film klassen mulighed for at
”koble” en producer til en film
 */

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmtitel, int udgivelsesår) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String filmtitel) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = Year.now().getValue();
    }

    public void addProducer(Producer producer) {
        this.producer = producer;
    }

    public String toString() {
        return "Filmtitel: " + filmtitel + " Udgivelsesår: " + "Producer: " + producer.getName();
    }
    public static void main(String[] args) {
        Film film = new Film("The Matrix", 1999);
        film.addProducer(new Producer("Lana Wachowski"));
        System.out.println(film);

    }
}
