class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    void display() {
        if (imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(4, 5);
        ComplexNumber second = new ComplexNumber(3, 2);
        ComplexNumber result = first.add(second);

        System.out.print("First number: ");
        first.display();
        System.out.print("Second number: ");
        second.display();
        System.out.print("Sum: ");
        result.display();

        System.out.println("Java does not allow custom operator overloading for user-defined classes.");
        System.out.println("Methods such as add() are used to define such operations.");
    }
}
