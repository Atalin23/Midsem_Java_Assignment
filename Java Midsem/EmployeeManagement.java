import java.util.Scanner;

// Employee class
class Employee {
    String empName;
    int empId;
    String address;
    String mailId;
    String mobileNo;
    double basicPay;

    Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    void calculateSalary(String designation) {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;

        System.out.println("\nPay Slip for " + designation);
        System.out.println("----------------------------------");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (97% of BP): " + da);
        System.out.println("HRA (10% of BP): " + hra);
        System.out.println("PF (12% of BP): " + pf);
        System.out.println("Staff Club Fund (0.1% of BP): " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

// Programmer class
class Programmer extends Employee {
    Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void generatePaySlip() {
        calculateSalary("Programmer");
    }
}

// AssistantProfessor class
class AssistantProfessor extends Employee {
    AssistantProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void generatePaySlip() {
        calculateSalary("Assistant Professor");
    }
}

// AssociateProfessor class
class AssociateProfessor extends Employee {
    AssociateProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void generatePaySlip() {
        calculateSalary("Associate Professor");
    }
}

// Professor class
class Professor extends Employee {
    Professor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }

    void generatePaySlip() {
        calculateSalary("Professor");
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mailId = scanner.nextLine();
        System.out.print("Mobile No: ");
        String mobileNo = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();

        System.out.println("Choose Designation:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Programmer programmer = new Programmer(name, id, address, mailId, mobileNo, basicPay);
                programmer.generatePaySlip();
                break;
            case 2:
                AssistantProfessor assistantProfessor = new AssistantProfessor(name, id, address, mailId, mobileNo, basicPay);
                assistantProfessor.generatePaySlip();
                break;
            case 3:
                AssociateProfessor associateProfessor = new AssociateProfessor(name, id, address, mailId, mobileNo, basicPay);
                associateProfessor.generatePaySlip();
                break;
            case 4:
                Professor professor = new Professor(name, id, address, mailId, mobileNo, basicPay);
                professor.generatePaySlip();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}