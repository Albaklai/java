import java.util.Scanner; 

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Quadratic Equation Real Solutions Solver!");
        System.out.println("A quadratic equation is in the form: ax^2 + bx + c = 0");

        double a, b, c; 

        while (true) {
            System.out.print("Enter coefficient a: ");
            if (input.hasNextDouble()) {
                a = input.nextDouble();
                if (a == 0) {
                    System.out.println("Error: Coefficient 'a' cannot be zero for a quadratic equation. Please enter a non-zero value.");
                } else {
                    break; 
                }
            } else {
                System.out.println("Invalid input. Please enter a number for 'a'.");
                input.next(); 
            }
        }

       
        while (true) {
            System.out.print("Enter coefficient b: ");
            if (input.hasNextDouble()) {
                b = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number for 'b'.");
                input.next(); 
            }
        }

        
        while (true) {
            System.out.print("Enter coefficient c: ");
            if (input.hasNextDouble()) {
                c = input.nextDouble();
                break; 
            } else {
                System.out.println("Invalid input. Please enter a number for 'c'.");
                input.next();
            }
        }

        
        double discriminant = b * b - 4 * a * c;

        System.out.println("\nCalculating real roots...");

        if (discriminant > 0) {
           
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct real solutions:");
            System.out.printf("Solution 1 = %.4f%n", root1); 
            System.out.printf("Solution 2 = %.4f%n", root2);
        } else if (discriminant == 0) {
            
            double root = -b / (2 * a);
            System.out.println("The equation has one real solution (or two equal real solutions):");
            System.out.printf("Solution = %.4f%n", root);
        } else {
            
            System.out.println("The discriminant (b^2 - 4ac) is negative.");
            System.out.println("Therefore, there are no real solutions for this quadratic equation.");
            
        }

        input.close();
        System.out.println("\nProgram finished.");
    }
}
