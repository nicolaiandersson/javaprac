/*
Øvelse 6
1. Opret en klasse "Bankkonto" med attributterne kontonummer og saldo.
2. Tilføj metoder til at indsætte penge, trække penge og få saldoen.
3. Opret en testklasse, der instantierer et par Bankkonto-objekter, foretager nogle ind- og udbetalinger og udskriver saldoen for hver konto.

 */

public class Bankkonto {

    private int accountNumber;
    private double balance;

    public Bankkonto(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void removeMoney(double amount) {
        balance -= amount;
    }

    public String toString() {
        return "Kontonummer: " + accountNumber + " Saldo: " + balance;
    }

    public static void main(String[] args) {
        Bankkonto bankkonto = new Bankkonto(152593,5000);
        System.out.println(bankkonto);

        bankkonto.addMoney(2000);
        System.out.println(bankkonto);

        bankkonto.removeMoney(4000);
        System.out.println(bankkonto);
    }
}
