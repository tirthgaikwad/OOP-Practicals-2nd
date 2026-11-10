
class Employee {

    int id;
    String name;
    double salary;

    // Default constructor 
    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0;
    }

    // Constructor with name only
    Employee(String n) {
        id = 0;
        name = n;
        salary = 0;
    }

    // Constructor with name and salary
    Employee(String n, double s) {
        id = 0;
        name = n;
        salary = s;
    }

    // Constructor with all details
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    // Display employee details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: " + salary);

        System.out.println("Annual Salary: " + (salary * 12));
        System.out.println("----------------------");
    }
}

public class exam {
    public static void main(String args[]) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Amit", 25000);
        Employee e4 = new Employee(101, "Tirth", 30000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
