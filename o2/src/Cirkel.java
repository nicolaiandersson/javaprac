public class Cirkel {
    private double radius;
    private String color;

    public Cirkel(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double beregnOmkreds() {
        return 2 * radius * Math.PI;
    }

    public double beregnAreal() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cirkel{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
