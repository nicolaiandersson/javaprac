/*
Øvelse 1

1. Opret en klasse "Person" med attributterne navn, alder og højde (alle som private).
2. Tilføj konstruktører og getter- og setter-metoder for alle attributterne.
3. Tilføj en metode "toString" for at kunne udskrive en person i et læsbart format.

 */

public class Person {

    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "Navn: " + getName() + " Alder: " + getAge() + " Højde: " + getHeight();
    }

    public static void main(String[] args) {
        Person person = new Person("Anders", 20, 180);

        System.out.println(person);
    }


}