class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;   
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {

        Student s1 = new Student("Pari", 18);
        s1.display();
    }
}