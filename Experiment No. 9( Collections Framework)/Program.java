
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Salary: " + salary;
    }

    // Used by HashSet to identify duplicate employees
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Employee))
            return false;

        Employee e = (Employee) obj;
        return id == e.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class Main {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Amit", 25000));
        list.add(new Employee(102, "Rahul", 30000));
        list.add(new Employee(103, "Priya", 35000));

        // HashSet
        HashSet<Employee> set = new HashSet<>(list);

        // HashMap
        HashMap<Integer, Employee> map = new HashMap<>();

        for (Employee e : list) {
            map.put(e.id, e);
        }

        // Display ArrayList using Iterator
        System.out.println("ArrayList Employees:");
        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Display HashSet using Iterator
        System.out.println("\nHashSet Employees:");
        Iterator<Employee> itr2 = set.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // Display HashMap using Iterator
        System.out.println("\nHashMap Employees:");
        Iterator<Map.Entry<Integer, Employee>> itr3 =
                map.entrySet().iterator();

        while (itr3.hasNext()) {
            Map.Entry<Integer, Employee> entry = itr3.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
