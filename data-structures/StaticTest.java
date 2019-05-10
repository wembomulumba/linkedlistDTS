package Programming;
/**
 * This Program demonstrates static methods
 * @version 1.01 2019-02-19
 * @author Wembo Otepa Mulumba
 */
public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 4000);
        staff[1] = new Employee("Dick", 6000);
        staff[2] = new Employee("Potter", 7000);

        // print out information about  all Employee objects
        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + " , id=" + e.getId() + ", Salary=" + e.getSalary());
        }

        int n = Employee.getNextId(); // calls statsic method
        System.out.println("Next available id=" + n);
    }
}

class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String n,  double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;

    }

    public void setId()
    {
        id = nextId; // returns static field
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) // Unit test
    {
        Employee e = new Employee("Harry", 5000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
