import java.util.*;

interface Academic
{
    void StoreAcademicDetails();
    void DisplayAcademicDetails();
}

interface Sports
{
    void StoreSportsDetails();
    void DisplaySportsDetails();
}

class Student implements Academic, Sports
{
    String name, course, sport, achievement;
    int rollno;
    double percentage;

    Scanner sc = new Scanner(System.in);

    public void StoreAcademicDetails()
    {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        course = sc.nextLine();

        System.out.print("Enter Student Percentage: ");
        percentage = sc.nextDouble();
        sc.nextLine();
    }

    public void DisplayAcademicDetails()
    {
        System.out.println("\nAcademic Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Course Name: " + course);
        System.out.println("Percentage: " + percentage);
    }

    public void StoreSportsDetails()
    {
        System.out.print("\nEnter Sport Name: ");
        sport = sc.nextLine();

        System.out.print("Enter Sport Achievement: ");
        achievement = sc.nextLine();
    }

    public void DisplaySportsDetails()
    {
        System.out.println("\nSports Details");
        System.out.println("Sport: " + sport);
        System.out.println("Achievement: " + achievement);
    }
}

public class pratical_6
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.StoreAcademicDetails();
        s.DisplayAcademicDetails();

        s.StoreSportsDetails();
        s.DisplaySportsDetails();
    }
}
