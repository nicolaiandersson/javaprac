/*
Øvelse 18
1. Opret en klasse "House" med attributterne length og width,
og en konstruktør for at initialisere attributterne.
2. Tilføj en metode "calculateArea" i House-klassen, der beregner og
returnerer arealet af huset ved at gange længden og bredden.
3. Opret en testklasse med en main-metode, der instantierer et House-objekt,
beregner arealet ved hjælp af "calculateArea" metoden og udskriver resultatet.
 */

public class House {
    private int length;
    private int width;

    public House(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        House house = new House(40,35);

        System.out.println(house.calculateArea());
    }
}
