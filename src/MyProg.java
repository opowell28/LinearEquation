import java.util.Scanner;

/**
 * Takes user input for slope and intercept of two separate linear equations, then runs computeIntercept().
 * @author Owen Powell
 * @see java.util.Scanner
 */

public class MyProg {
    public static void main(String[] args) {
        // initialize objects
        LinearEquation linearEquation1 = new LinearEquation(0, 0);
        LinearEquation linearEquation2 = new LinearEquation(0, 0);

        // P&R for values
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter slope for equation 1: ");
        linearEquation1.setM(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter y-intercept for equation 1: ");
        linearEquation1.setB(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter slope for equation 2: ");
        linearEquation2.setM(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter y-intercept for equation 2: ");
        linearEquation2.setB(scanner.nextDouble());
        scanner.nextLine();

        scanner.close();

        // compute intercepts
        linearEquation1.computeIntercept(linearEquation2);
    }
}
