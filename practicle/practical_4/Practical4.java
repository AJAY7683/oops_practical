package practical_4;
//  Practical 4: Method Overloading and Method Overriding
// --- Method Overloading Example ---
class Calculator {
    // Overloaded methods named add()
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// --- Method Overriding Example ---
class Employee {
    double calculatePay() {
        return 0.0; // base implementation
    }
}

class HourlyEmployee extends Employee {
    double hoursWorked, hourlyRate;

    HourlyEmployee(double h, double r) {
        hoursWorked = h; hourlyRate = r;
    }

    @Override
    double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

class SalariedEmployee extends Employee {
    double monthlySalary;

    SalariedEmployee(double s) {
        monthlySalary = s;
    }

    @Override
    double calculatePay() {
        return monthlySalary;
    }
}

// --- Main Class ---
public class Practical4 {
    public static void main(String[] args) {
        System.out.println("=== Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("Add two ints: " + calc.add(5, 10));
        System.out.println("Add two doubles: " + calc.add(5.5, 2.3));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));

        System.out.println("\n=== Method Overriding ===");
        Employee e1 = new HourlyEmployee(40, 200);   // base-class reference
        Employee e2 = new SalariedEmployee(50000);

        System.out.println("Hourly Employee Pay: " + e1.calculatePay());
        System.out.println("Salaried Employee Pay: " + e2.calculatePay());
    }
}
