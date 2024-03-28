import figures.Calculable;
import figures.Circle;
import figures.Square;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Calculable[] figures = new Calculable[]
                {new Circle(28), new Triangle(18), new Square(8)};

        System.out.printf("Total figures area: %.2f \n", getTotalFigureArea(figures));
    }

    private static double getTotalFigureArea(Calculable[] figures) {
        double totalFigureArea = 0.0;
        for (Calculable figure : figures) {
            totalFigureArea += figure.calculateArea();
        }
        return totalFigureArea;
    }
}