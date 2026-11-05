class Employee {
    String employeeName;
    double salary;
    static int employeeCount = 0;

    Employee() {
        this("Not Assigned", 0.0);
    }

    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    static void displayEmployeeCount() {
        System.out.println("Total employees created: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Aman", 35000);
        Employee e3 = new Employee("Riya", 42000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayEmployeeCount();
    }
}
