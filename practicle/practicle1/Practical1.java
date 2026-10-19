package practicle1;
// Class definition
class Student {
    // Instance variables
    int rollNumber;
    String name;
    int marks1, marks2, marks3;

    // Constructor
    Student(int rollNumber, String name, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate total marks
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        return (calculateTotal() / 3.0);
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("-----------------------------");
    }
}

// Main class
public class Practical1 {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student s1 = new Student(101, "Aarav", 85, 90, 88);
        Student s2 = new Student(102, "Priya", 78, 82, 80);
        Student s3 = new Student(103, "Rohan", 92, 89, 95);

        // Displaying details of each student
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
