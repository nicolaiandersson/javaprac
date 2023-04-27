/*
Øvelse 7
1. Opret en klasse "Bog" med attributterne titel, forfatter og antalSider.
2. Opret en ArrayList af Bog-objekter og tilføj et par bøger til listen.
3. Skriv en metode "findBogMedFlestSider" for at finde bogen med flest sider og udskrive dens titel og forfatter.
 */

import java.util.ArrayList;

public class Bog {
    private String title;
    private String author;
    private int pages;
    private ArrayList<Bog> books = new ArrayList<>();

    public Bog(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void findBookWithMostPages() {
        int maxPages = 0;
        String title = "";
        String author = "";

        for (Bog bog : books) {
            if (bog.pages > maxPages) {
                maxPages = bog.pages;
                title = bog.title;
                author = bog.author;
            }
        }
        System.out.println("Bogen med flest sider er " + title + " af " + author + " med " + maxPages + " sider.");
    }

    @Override
    public String toString() {
        return "Bog{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Bog> books = new ArrayList<>();

        Bog bog = new Bog("Eventyr", "HC", 200);
        Bog bog2 = new Bog("Trolde", "HC", 500);
        Bog bog3 = new Bog("Hekse", "HC", 400);

        books.add(bog);
        books.add(bog2);
        books.add(bog3);




    }





}
