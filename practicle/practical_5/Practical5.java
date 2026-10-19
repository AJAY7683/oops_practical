package practical_5;
// Practical 5: Simulating Operator Overloading Using Methods

class ComplexNumber {
    double real, imag;

    // Constructor
    ComplexNumber(double r, double i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imag + other.imag);
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

// --- Main Class ---
public class Practical5 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);   // 3 + 4i
        ComplexNumber c2 = new ComplexNumber(1, 2);   // 1 + 2i

        ComplexNumber sum = c1.add(c2);               // add both

        System.out.println("First Complex Number: ");
        c1.display();

        System.out.println("Second Complex Number: ");
        c2.display();

        System.out.println("Sum of Complex Numbers: ");
        sum.display();
    }
}
