import java.lang.ref.WeakReference;

class SampleObject {
    SampleObject() {
        System.out.println("Object constructed.");
    }

    void useObject() {
        System.out.println("Object is being used.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SampleObject object = new SampleObject();
        object.useObject();

        WeakReference<SampleObject> reference = new WeakReference<>(object);
        object = null;

        System.out.println("Strong reference removed.");
        System.out.println("Requesting garbage collection.");
        System.gc();

        Thread.sleep(500);

        if (reference.get() == null) {
            System.out.println("The object has been garbage collected.");
        } else {
            System.out.println("The object is still available; collection is not guaranteed immediately.");
        }

        System.out.println("An object becomes eligible when it is no longer reachable.");
        System.out.println("Java manages memory automatically through garbage collection.");
        System.out.println("Unlike C++ destructors, Java has no deterministic object destructor.");
    }
}
