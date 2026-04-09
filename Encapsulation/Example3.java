class Student {

    private String name;
    private int marks;

        public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Example3 {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Rahul");
        s.setMarks(85);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}