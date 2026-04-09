class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

public class Single {
    public static void main(String[] args) {
        Developer d = new Developer("Amit", 60000, "Java");
        d.showDetails();
    }
}