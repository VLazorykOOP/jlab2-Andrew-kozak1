package lab22;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the side of the square: ");
        double sideLength = scanner.nextDouble();

        Square square = new Square(sideLength);
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Area: " + square.getArea());
        System.out.println("Diagonal length: " + square.getDiagonalLength());

        scanner.close();
    }
}
