import java.util.Scanner;

class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private String connectionType;

    public ElectricityBill(int consumerNo, String consumerName, double previousReading, double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType.toLowerCase();
    }

    @SuppressWarnings("ConvertToStringSwitch")
    public double calculateBill() {
        double unitsConsumed = currentReading - previousReading;
        double billAmount = 0;

        if (connectionType.equals("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2.0;
            } else if (unitsConsumed <= 200) {
                billAmount = (100 * 2.0) + ((unitsConsumed - 100) * 4.5);
            } else if (unitsConsumed <= 500) {
                billAmount = (100 * 2.0) + (100 * 4.5) + ((unitsConsumed - 200) * 6.0);
            } else {
                billAmount = (100 * 2.0) + (100 * 4.5) + (300 * 6.0) + ((unitsConsumed - 500) * 7.0);
            }
        } else if (connectionType.equals("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1.0;
            } else if (unitsConsumed <= 200) {
                billAmount = (100 * 1.0) + ((unitsConsumed - 100) * 2.5);
            } else if (unitsConsumed <= 500) {
                billAmount = (100 * 1.0) + (100 * 2.5) + ((unitsConsumed - 200) * 4.0);
            } else {
                billAmount = (100 * 1.0) + (100 * 2.5) + (300 * 4.0) + ((unitsConsumed - 500) * 6.0);
            }
        } else {
            System.out.println("Invalid connection type.");
            return 0;
        }
        return billAmount;
    }

    public void displayBill() {
        System.out.println("\nElectricity Bill");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousReading);
        System.out.println("Current Month Reading: " + currentReading);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Total Bill Amount: Gh. " + calculateBill());
    }

    public int getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(int consumerNo) {
        this.consumerNo = consumerNo;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(double previousReading) {
        this.previousReading = previousReading;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }
}

public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Consumer No: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
        
        System.out.print("Enter Previous Month Reading: ");
        double previousReading = scanner.nextDouble();
        
        System.out.print("Enter Current Month Reading: ");
        double currentReading = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        String connectionType = scanner.nextLine();
        
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, previousReading, currentReading, connectionType);
        bill.displayBill();
        
        scanner.close();
    }
}
