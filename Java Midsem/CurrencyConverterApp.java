
import java.util.Scanner;

public class CurrencyConverterApp {

    // Currency Converter
    static class CurrencyConverter {
        private static final double DOLLAR_TO_GH = 15.0;
        private static final double EURO_TO_GH = 16.0;
        private static final double YEN_TO_GH = 0.05;

        public static double dollarToGh(double amount) {
            return amount * DOLLAR_TO_GH;
        }

        public static double ghToDollar(double amount) {
            return amount / DOLLAR_TO_GH;
        }

        public static double euroToGh(double amount) {
            return amount * EURO_TO_GH;
        }

        public static double ghToEuro(double amount) {
            return amount / EURO_TO_GH;
        }

        public static double yenToGh(double amount) {
            return amount * YEN_TO_GH;
        }

        public static double ghToYen(double amount) {
            return amount / YEN_TO_GH;
        }
    }

    // Distance Converter
    static class DistanceConverter {
        public static double meterToKm(double meters) {
            return meters / 1000;
        }

        public static double kmToMeter(double kilometers) {
            return kilometers * 1000;
        }

        public static double milesToKm(double miles) {
            return miles * 1.60934;
        }

        public static double kmToMiles(double kilometers) {
            return kilometers / 1.60934;
        }
    }

    // Time Converter
    static class TimeConverter {
        public static int hoursToMinutes(int hours) {
            return hours * 60;
        }

        public static int minutesToHours(int minutes) {
            return minutes / 60;
        }

        public static int hoursToSeconds(int hours) {
            return hours * 3600;
        }

        public static int secondsToHours(int seconds) {
            return seconds / 3600;
        }

        public static int minutesToSeconds(int minutes) {
            return minutes * 60;
        }

        public static int secondsToMinutes(int seconds) {
            return seconds / 60;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select conversion type:");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> currencyConverter(scanner);
                case 2 -> distanceConverter(scanner);
                case 3 -> timeConverter(scanner);
                case 4 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void currencyConverter(Scanner scanner) {
        System.out.println("Currency Converter:");
        System.out.println("1. Dollar to GH");
        System.out.println("2. GH to Dollar");
        System.out.println("3. Euro to GH");
        System.out.println("4. GH to Euro");
        System.out.println("5. Yen to GH");
        System.out.println("6. GH to Yen");
        int choice = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        switch (choice) {
            case 1 -> System.out.println("Converted: " + CurrencyConverter.dollarToGh(amount) + " GH");
            case 2 -> System.out.println("Converted: " + CurrencyConverter.ghToDollar(amount) + " $");
            case 3 -> System.out.println("Converted: " + CurrencyConverter.euroToGh(amount) + " GH");
            case 4 -> System.out.println("Converted: " + CurrencyConverter.ghToEuro(amount) + " €");
            case 5 -> System.out.println("Converted: " + CurrencyConverter.yenToGh(amount) + " GH");
            case 6 -> System.out.println("Converted: " + CurrencyConverter.ghToYen(amount) + " ¥");
            default -> System.out.println("Invalid choice.");
        }
    }

    private static void distanceConverter(Scanner scanner) {
        System.out.println("Distance Converter:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Miles to Kilometers");
        System.out.println("4. Kilometers to Miles");
        int choice = scanner.nextInt();
        System.out.print("Enter distance: ");
        double distance = scanner.nextDouble();
        switch (choice) {
            case 1 -> System.out.println("Converted: " + DistanceConverter.meterToKm(distance) + " Kilometers");
            case 2 -> System.out.println("Converted: " + DistanceConverter.kmToMeter(distance) + " Meters");
            case 3 -> System.out.println("Converted: " + DistanceConverter.milesToKm(distance) + " Kilometers");
            case 4 -> System.out.println("Converted: " + DistanceConverter.kmToMiles(distance) + " Miles");
            default -> System.out.println("Invalid choice.");
        }
    }

    private static void timeConverter(Scanner scanner) {
        System.out.println("Time Converter:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.println("3. Hours to Seconds");
        System.out.println("4. Seconds to Hours");
        System.out.println("5. Minutes to Seconds");
        System.out.println("6. Seconds to Minutes");
        int choice = scanner.nextInt();
        System.out.print("Enter time: ");
        int time = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Converted: " + TimeConverter.hoursToMinutes(time) + " Minutes");
            case 2 -> System.out.println("Converted: " + TimeConverter.minutesToHours(time) + " Hours");
            case 3 -> System.out.println("Converted: " + TimeConverter.hoursToSeconds(time) + " Seconds");
            case 4 -> System.out.println("Converted: " + TimeConverter.secondsToHours(time) + " Hours");
            case 5 -> System.out.println("Converted: " + TimeConverter.minutesToSeconds(time) + " Seconds");
            case 6 -> System.out.println("Converted: " + TimeConverter.secondsToMinutes(time) + " Minutes");
            default -> System.out.println("Invalid choice.");
        }
    }
}