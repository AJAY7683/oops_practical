class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double ratePerHour;

    PartTimeEmployee(int hours, double ratePerHour) {
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculatePay() {
        return hours * ratePerHour;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("add(int, int): " + calculator.add(10, 20));
        System.out.println("add(int, int, int): " + calculator.add(10, 20, 30));
        System.out.println("add(double, double): " + calculator.add(5.5, 4.2));

        Employee employee;

        employee = new FullTimeEmployee(45000);
        System.out.println("Full-time employee pay: " + employee.calculatePay());

        employee = new PartTimeEmployee(80, 250);
        System.out.println("Part-time employee pay: " + employee.calculatePay());

        System.out.println("Overloading: compile-time polymorphism.");
        System.out.println("Overriding: runtime polymorphism.");
    }
}
