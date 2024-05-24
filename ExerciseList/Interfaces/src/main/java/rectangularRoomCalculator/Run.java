package rectangularRoomCalculator;

public class Run {
    public static void main(String[] args) {
        GeometricCalculation rectangularRoomCalculator = new RectangularRoomCalculator();

        double height = 24;
        double width = 10;

        double area = rectangularRoomCalculator.calculateArea(height, width);
        double perimeter = rectangularRoomCalculator.calculatePerimeter(height, width);

        System.out.printf("Área da sala é de %.0f metros quadrados!%n", area);
        System.out.printf("Perímetro da sala é de %.0f metros!%n", perimeter);
    }
}
