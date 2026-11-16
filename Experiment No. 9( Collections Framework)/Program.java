
import java.util.*;

class Employee
{
    int id;
    String name;

    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println(id + " " + name);
    }
}

public class Practical_9
{
    public static void main(String[] args)
    {
        // ArrayList
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Rahul"));
        list.add(new Employee(2, "Amit"));

        System.out.println("ArrayList:");

        Iterator<Employee> it = list.iterator();

        while(it.hasNext())
        {
            it.next().display();
        }

        // HashSet
        HashSet<String> set = new HashSet<>();

        set.add("Rahul");
        set.add("Amit");
        set.add("Rahul");

        System.out.println("\nHashSet:");
        System.out.println(set);

        // HashMap
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Rahul");
        map.put(2, "Amit");

        System.out.println("\nHashMap:");
        System.out.println(map);

        // Retrieve employee
        System.out.println("\nEmployee with ID 1: " + map.get(1));
    }
}
