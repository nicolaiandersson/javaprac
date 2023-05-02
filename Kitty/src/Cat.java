/*
Øvelse 17
1. Opret en klasse "Cat" med attributterne name og numberOfLives, og en konstruktør for at initialisere attributterne.
Tilføj også en metode "retractLives" for at trække et liv fra katten og en getter-metode for både name og numberOfLives.
2. Opret en ekstra klasse "numberOfLivesComparator"
der implementerer Comparator-interface for at sammenligne antallet af liv mellem to Cat-objekter.
3. Opret en testklasse med en main-metode, der instantierer flere Cat-objekter,
trækker liv fra nogle af dem, sorterer dem efter antallet af liv, og udskriver navnene og antallet af liv for hver kat før og efter
sorteringen.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Cat {
    private String name;
    private int numberOfLives;

    public Cat(String name) {
        this.name = name;
        this.numberOfLives = 9;
    }


    public void retractLives() {
        this.numberOfLives --;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", numberOfLives=" + numberOfLives +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();

        Cat cat = new Cat("Kat");
        Cat cat2 = new Cat("Kit");
        Cat cat3 = new Cat("Kot");

        Collections.addAll(cats, cat,cat2,cat3);

        System.out.println(cats);

        cat2.retractLives();
        cat2.retractLives();

        cat.retractLives();
        cat.retractLives();
        cat.retractLives();
        cat.retractLives();


        Collections.sort(cats, new catLivesComparator());

        System.out.println(cats);


    }
}
