
import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {
    static void getInfo() {
        double initialSalary;
        int numberOfHourPerDay;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salary:");
        initialSalary = scanner.nextDouble();
        System.out.println("Hours worked per Day:");
        numberOfHourPerDay = scanner.nextInt();
    }

    static void addSal() {
        final double salaryLessThan500;
    }

    static void addWork() {
        int workHourAbove6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salary:");
        double initialSalary = scanner.nextDouble();
        System.out.print("Number of Hours of work per day:");
        int numberOfHours = scanner.nextInt();
        if (initialSalary < 500 && numberOfHours > 6)
            System.out.println(NumberFormat.getCurrencyInstance().format(initialSalary) + 10 + 5);
        else if (initialSalary > 500 && numberOfHours > 6)
            System.out.println(NumberFormat.getCurrencyInstance().format(initialSalary) + 5);
        else
            System.out.println(NumberFormat.getCurrencyInstance().format(initialSalary));

    }
}

