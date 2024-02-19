#Robert Hicks AITC251


public class Main {
    public statiaic void main(String[] args) {
        // Box
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
        
        // Oval
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
        
        // Arrow
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        System.out.println("    *    ");
        
        // Diamond
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("  *   *  ");
        System.out.println("   * *   ");
        System.out.println("    *    ");
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // "Enter an Integer:"
        System.out.println("Enter an Integer:");

        // Obtain the two integers from the user
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int a = b * c;

        // Sample payroll calculation

        // Print the sum, product, difference, and quotient of the two integers
        System.out.println("Sum: " + (b + c));
        System.out.println("Product: " + a);
        System.out.println("Difference: " + (b - c));
        System.out.println("Quotient: " + (b / c));

        scanner.close();
    }

}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double quotient = (double) num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}