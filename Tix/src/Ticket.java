/*
Øvelse 15
1. Opret en klasse "Ticket" med attributterne eventName, date og isUsed.
Tilføj en konstruktør for at initialisere attributterne.
2. Tilføj en metode "use", der markerer billetten som brugt, hvis den ikke allerede er brugt,
og kaster en undtagelse, hvis den allerede er brugt.
3. Opret en testklasse med en main-metode, der instantierer et Ticket-objekt og kalder "use" metoden to gange,
fanger undtagelsen og udskriver "Fail" i tilfælde af undtagelsen.
 */

import java.time.LocalDate;

public class Ticket {
    private String eventName;
    private LocalDate date;
    private boolean isUsed;

    public Ticket(String eventName, LocalDate date) {
        this.eventName = eventName;
        this.date = date;
        this.isUsed = false;
    }

    public void useTicket() throws Exception {
        if(!isUsed) {
            this.isUsed = true;
        } else {
            throw new Exception("Already used");
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "eventName='" + eventName + '\'' +
                ", date=" + date +
                ", isUsed=" + isUsed +
                '}';
    }

    public static void main(String[] args) throws Exception {
        Ticket ticket = new Ticket("JB", LocalDate.now());
        System.out.println(ticket);
        ticket.useTicket();
        System.out.println(ticket);

        try {
            ticket.useTicket();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
