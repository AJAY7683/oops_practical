package practical3;
// Practical 3: Hybrid and Multiple Inheritance Using Interfaces

// --- Multiple Inheritance using Interfaces ---
interface Printable { void print(); }
interface Scannable { void scan(); }

class AllInOnePrinter implements Printable, Scannable {
    public void print() { System.out.println("Printing document..."); }
    public void scan() { System.out.println("Scanning document..."); }
}

// --- Hybrid Inheritance (Class + Interfaces) ---
class Device {
    String brand;
    Device(String b){ brand=b; }
    void showBrand(){ System.out.println("Brand: "+brand); }
}

interface Connectable { void connect(); }
interface Rechargeable { void recharge(); }

class Smartphone extends Device implements Connectable, Rechargeable {
    Smartphone(String b){ super(b); }
    public void connect(){ System.out.println("Connected to Wi-Fi."); }
    public void recharge(){ System.out.println("Charging..."); }
}

// --- Main Class ---
public class Practical3 {
    public static void main(String[] args) {
        System.out.println("=== Multiple Inheritance via Interfaces ===");
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println("\n=== Hybrid Inheritance ===");
        Smartphone phone = new Smartphone("Samsung");
        phone.showBrand();
        phone.connect();
        phone.recharge();
    }
}

