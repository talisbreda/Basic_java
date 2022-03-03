import java.util.Scanner;

public class geometryCalculator {

    public static double calculate(double side) {
        return side * side;
    }

    public static double calculate(double side1, double side2, double side3) {
        double perimeterSolve = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(perimeterSolve
                * (perimeterSolve - side1)
                * (perimeterSolve - side2)
                * (perimeterSolve - side3));
        return area;
    }

    public static double calculate(double bigBase, double smallBase, double side1, double side2) {
        double triangleSide1 = (bigBase - smallBase) / 2;
        double height = Math.sqrt((side1 * side1) + (triangleSide1 * triangleSide1));
        return ((bigBase + smallBase) * height) / 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert 1 for square, 2 for triangle and 3 for trapezium");
        int format = scan.nextInt();

        double message = switch (format) {
            case 1:
                System.out.println("Insert value of the side");
                double side = scan.nextDouble();
                yield calculate(side);
            case 2:
                System.out.println("Insert the values of the sides");
                double side1 = scan.nextDouble();
                double side2 = scan.nextDouble();
                double side3 = scan.nextDouble();
                yield calculate(side1, side2, side3);
            case 3:
                System.out.println("Insert the values of the big base, small base, first side and second side");
                double bigBase = scan.nextDouble();
                double smallBase = scan.nextDouble();
                side1 = scan.nextDouble();
                side2 = scan.nextDouble();
                yield calculate(bigBase, smallBase, side1, side2);
            default:
                System.out.println("Please enter a valid number from 1 to 3");
                yield 0;
        };
        System.out.println("Área: " + message);
    }
}
