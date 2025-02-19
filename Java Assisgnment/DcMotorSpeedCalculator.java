import java.util.Scanner;

public class DcMotorSpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Voltage, BackEMF, and MotorConstant
        System.out.print("Enter Voltage (V): ");
        double voltage = scanner.nextDouble();

        System.out.print("Enter Back EMF (V): ");
        double backEMF = scanner.nextDouble();

        System.out.print("Enter Motor Constant (V/RPM): ");
        double motorConstant = scanner.nextDouble();

        // Validate inputs
        if (motorConstant <= 0) {
            System.out.println("Error: Motor Constant must be a positive value.");
        } else if (voltage < 0 || backEMF < 0) {
            System.out.println("Error: Voltage and Back EMF must be non-negative values.");
        } else {
            // Calculate speed
            double speed = (voltage - backEMF) / motorConstant;

            // Display the result
            System.out.printf("The speed of the DC motor is: %.2f RPM%n", speed);
        }

        scanner.close();
    }
}