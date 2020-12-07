import java.util.Scanner;
public class TestTri {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three sides: ");

        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

        System.out.println("Colour: ");
        String color = in.next();

        System.out.println("Triangle filled?(true/false): ");
        boolean filled = in.nextBoolean();

        Triangle tri = new Triangle(side1, side2, side3);
        tri.setColor(color);
        tri.setFilled(filled);

        System.out.println(tri.toString());
        System.out.println("Area: " +tri.getArea());
        System.out.println("Perimeter: " +tri.getPerimeter());
        System.out.println("Colour: " +tri.getColor());
        System.out.println("Triangle is " +(tri.isFilled() ? "" : "not filled"));
    } 
}
