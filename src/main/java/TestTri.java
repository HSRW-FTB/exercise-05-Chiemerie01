import java.util.Scanner;
public class TestTri {
    public static voidn main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three sides: ");

        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

        System.out.println("Colour: ");
        String color = in.next();

        System.out.println("Triangle filled?(true/false): ");
        boolean filled = in.nextBoolean();
    } 
}
