import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {

        // Step 2: Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Step 3: Prompt for Radius
        System.out.print("Enter the radius of the circle: ");

        // Step 4: Read Radius Input
        double radius = input.nextDouble();

        // Step 5: Calculate Area
        double area = Math.PI * Math.pow(radius, 2);

        // Step 6: Calculate Circumference
        double circumference = 2 * Math.PI * radius;

        // Step 7: Output Results (Formatted)
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Step 8: Close the Scanner Object
        input.close();
    }
}
