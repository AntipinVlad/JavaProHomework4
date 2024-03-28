package figures;

public class Square implements Calculable{

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        double calculatedArea = Math.round(sideLength * sideLength);
        System.out.printf("Square area: %.2f \n", calculatedArea);
        return calculatedArea;
    }
}
