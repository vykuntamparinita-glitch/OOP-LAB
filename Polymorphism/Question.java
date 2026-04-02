
class Calculator {

    // Public method
    public int add(int a, int b) {
        return a + b;
    }

    // Protected method
    protected void display() {
        System.out.println("This is Calculator class");
    }

    // Private method
    private void show() {
        System.out.println("Private show method in Calculator");
    }

    // Public method to access private method
    public void accessPrivate() {
        show();
    }
}


class AdvancedCalculator extends Calculator {

    // Overriding add()
    @Override
    public int add(int a, int b) {
        System.out.println("Advanced addition");
        return a + b + 10; // modified behavior
    }

    // Overriding display()
    @Override
    protected void display() {
        System.out.println("This is Advanced Calculator class");
    }

    // This is NOT overriding (because parent show() is private)
    public void show() {
        System.out.println("Show method in AdvancedCalculator");
    }
}

// Main Class
public class Question {
    public static void main(String[] args) {

        // Object of base class
        Calculator c = new Calculator();
        System.out.println("Addition: " + c.add(2, 3));
        c.display();
        c.accessPrivate();

        System.out.println("--------------------");

        // Object of child class
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("Addition: " + ac.add(2, 3));
        ac.display();
        ac.show();

        System.out.println("--------------------");

        // Runtime Polymorphism
        Calculator ref = new AdvancedCalculator();
        System.out.println("Addition: " + ref.add(2, 3));
        ref.display();
        ref.accessPrivate();
    }
}