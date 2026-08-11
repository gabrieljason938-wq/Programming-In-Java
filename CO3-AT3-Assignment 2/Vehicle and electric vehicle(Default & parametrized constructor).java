import java.util.Scanner;

public class Employee {
    String employeeId;
    String name;
    double basicSalary;

    Employee(String employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id1 = sc.nextLine();
        String name1 = sc.nextLine();
        double salary1 = sc.nextDouble();
        double bonus1 = sc.nextDouble();
        sc.nextLine();

        String id2 = sc.nextLine();
        String name2 = sc.nextLine();
        double salary2 = sc.nextDouble();
        double bonus2 = sc.nextDouble();
        sc.nextLine();

        String id3 = sc.nextLine();
        String name3 = sc.nextLine();
        double salary3 = sc.nextDouble();
        double bonus3 = sc.nextDouble();

        Manager manager1 = new Manager(id1, name1, salary1, bonus1);
        Manager manager2 = new Manager(id2, name2, salary2, bonus2);
        Manager manager3 = new Manager(id3, name3, salary3, bonus3);

        manager1.displayDetails();
        manager2.displayDetails();
        manager3.displayDetails();

        sc.close();
    }
}

class Manager extends Employee {
    double monthlyBonus;

    Manager(String employeeId, String name, double basicSalary,
            double monthlyBonus) {

        super(employeeId, name, basicSalary);
        this.monthlyBonus = monthlyBonus;
    }

    double calculateTotalSalary() {
        return basicSalary + monthlyBonus;
    }

    void displayDetails() {
        System.out.println("Manager Details");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Monthly Bonus: " + monthlyBonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println();
    }
}