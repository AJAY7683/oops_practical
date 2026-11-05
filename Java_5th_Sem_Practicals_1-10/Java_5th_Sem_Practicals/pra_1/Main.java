class Student {
    int rollNumber;
    String name;
    double subject1, subject2, subject3;

    Student(int rollNumber, String name, double subject1, double subject2, double subject3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    double calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + subject1 + ", " + subject2 + ", " + subject3);
        System.out.println("Total: " + calculateTotal() + "/300");
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 85, 90, 88);
        Student s2 = new Student(102, "Riya", 78, 82, 91);
        Student s3 = new Student(103, "Rahul", 92, 87, 95);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
