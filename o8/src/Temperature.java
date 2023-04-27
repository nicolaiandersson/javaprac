/*
Øvelse 8
1. Opret en klasse "Temperatur" med attributterne celsius og fahrenheit.
2. Tilføj metoder til at konvertere mellem celsius og fahrenheit.
3. Opret en testklasse, der instantierer et Temperatur-objekt, konverterer mellem celsius og fahrenheit og udskriver resultaterne.

 */

public class Temperature {
    private double celsius;
    private double fahrenheit;


    public Temperature(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double fahrenheitToCelsius() {
        return (fahrenheit - 32 ) * 5/9;
    }

    public double celsiusToFahrenheit() {
        return (celsius * 9/5 ) + 32;
    }

    public static void main(String[] args) {
        Temperature temp = new Temperature(20,50);

        System.out.println(temp.celsiusToFahrenheit());
        System.out.println(temp.fahrenheitToCelsius());
    }
}