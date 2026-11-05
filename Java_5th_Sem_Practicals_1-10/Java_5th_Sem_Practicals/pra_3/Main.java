interface Printable {
    void printDocument();
}

interface Scannable {
    void scanDocument();
}

class AllInOnePrinter implements Printable, Scannable {
    public void printDocument() {
        System.out.println("Printing document.");
    }

    public void scanDocument() {
        System.out.println("Scanning document.");
    }
}

class Machine {
    void switchOn() {
        System.out.println("Machine is switched on.");
    }
}

interface Connectable {
    void connectToNetwork();
}

class SmartPrinter extends Machine implements Printable, Connectable {
    public void printDocument() {
        System.out.println("Smart printer is printing.");
    }

    public void connectToNetwork() {
        System.out.println("Smart printer connected to network.");
    }
}

public class Main {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.printDocument();
        printer.scanDocument();

        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.switchOn();
        smartPrinter.printDocument();
        smartPrinter.connectToNetwork();

        System.out.println("Java supports multiple inheritance through interfaces.");
        System.out.println("It avoids ambiguity that can occur with multiple parent classes.");
    }
}
