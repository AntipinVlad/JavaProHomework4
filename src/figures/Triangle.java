package figures;

public class Triangle implements Calculable {

    private double sideLength;

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        double calculatedArea = Math.round((Math.sqrt(3) / 4) * (sideLength * sideLength));
        System.out.printf("Triangle area: %.2f \n", calculatedArea);
        return calculatedArea;
    }
}
