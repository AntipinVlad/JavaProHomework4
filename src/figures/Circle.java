package figures;

public class Circle implements Calculable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double calculatedArea = Math.round(Math.PI * (radius * radius));
        System.out.printf("Circle area: %.2f \n", calculatedArea);
        return calculatedArea;
    }
}
