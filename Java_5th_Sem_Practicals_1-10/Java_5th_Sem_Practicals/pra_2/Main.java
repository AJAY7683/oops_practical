class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    void showCar() {
        System.out.println("Car brand: " + brand + ", doors: " + doors);
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void showManager() {
        introduce();
        showEmployee();
        System.out.println("Department: " + department);
    }
}

class Shape {
    void describe() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.printf("Circle area: %.2f%n", Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Rectangle area: " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        Car car = new Car("Toyota", 4);
        car.start();
        car.showCar();

        System.out.println("\nMultilevel Inheritance");
        Manager manager = new Manager("Neha", 501, "IT");
        manager.showManager();

        System.out.println("\nHierarchical Inheritance");
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        circle.describe();
        circle.area();
        rectangle.describe();
        rectangle.area();
    }
}
