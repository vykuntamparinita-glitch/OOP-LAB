class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Manager m = new Manager("Neha", 90000, "IT");
        m.showDetails();
    }
}