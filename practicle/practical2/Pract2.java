package practical2;
// Practical 2: Demonstrating Single, Multilevel, and Hierarchical Inheritance

// ---------- SINGLE INHERITANCE ----------
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showVehicle() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void showCar() {
        showVehicle();
        System.out.println("Doors: " + doors);
    }
}

// ---------- MULTILEVEL INHERITANCE ----------
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }

    void showEmployee() {
        showPerson();
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    void showManager() {
        showEmployee();
        System.out.println("Department: " + department);
    }
}

// ---------- HIERARCHICAL INHERITANCE ----------
class Shape {
    void showShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

// ---------- MAIN CLASS ----------
public class Pract2 {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Car c1 = new Car("Honda", 180, 4);
        c1.showCar();

        System.out.println("\n=== Multilevel Inheritance ===");
        Manager m1 = new Manager("Priya", 2001, "HR");
        m1.showManager();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(4, 6);

        circle.showShape();
        circle.area();

        rect.showShape();
        rect.area();
    }
}
