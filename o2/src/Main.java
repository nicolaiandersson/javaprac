/*

Øvelse 2
1. Opret en klasse "Cirkel" med attributterne radius og farve.
2. Tilføj en metode "beregnOmkreds" for at beregne omkredsen af cirklen og en metode "beregnAreal" for at beregne arealet af cirklen.
3. Opret en testklasse, der instantierer et Cirkel-objekt, og udskriver dets omkreds og areal.

 */

public class Main {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(5, "Grøn");

        System.out.println(cirkel.beregnOmkreds());
        System.out.println(cirkel.beregnAreal());
    }
}