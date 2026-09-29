class Student {
    public int roll;
    public String name;
    public double CGPA;

    // Default constructor
    public Student() {
        roll = 0;
        name = "Unknown";
        CGPA = 0.00;
    }

    // Constructor with name only
    public Student(String name) {
        this.name = name;
        roll = 0;
        CGPA = 0.00;
    }

    // Constructor with name and CGPA
    public Student(String name, double CGPA) {
        this.name = name;
        this.CGPA = CGPA;
        roll = 0;
    }

    // Constructor with all details
    public Student(int roll, String name, double CGPA) {
        this.roll = roll;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Display student details
    void display() {
        System.out.println("Roll No. of student: " + roll);
        System.out.println("Name of student: " + name);
        System.out.println("CGPA of student: " + CGPA);
        System.out.println();
    }
}

public class Practical_2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Tirth");
        Student s3 = new Student("Lucky", 9.5);
        Student s4 = new Student(101, "Om", 6.0);

        System.out.println("Default Constructor");
        s1.display();

        System.out.println("Constructor with Name Only");
        s2.display();

        System.out.println("Constructor with Name and CGPA");
        s3.display();

        System.out.println("Constructor with All Details");
        s4.display();
    }
}
