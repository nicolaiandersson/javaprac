/*
Øvelse 3
1. Lav en klasse Raflebæger med en attribut for et antal terninger i
bægeret og en konstruktør der angiver antallet af terninger.
2. Tilføj en metode ”ryst” der ryster bægeret, og returnerer det
samlede antal øjne.
3. Tilføj en metode ”se” der returnerer listen af terningernes øjne
uden at ryste igen.
 */


import java.util.Random;

public class Raflebæger {
    private int antalTerninger;

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
    }

    public int ryst() {
      Random r = new Random();
      int sum = 0;

      for(int i = 0; i < antalTerninger; i++) {
          sum += r.nextInt(6) + 1;
      }
      return sum;
    }



    public static void main(String[] args) {
        Raflebæger raflebæger = new Raflebæger(2);
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.ryst());
        System.out.println(raflebæger.ryst());
    }
}
