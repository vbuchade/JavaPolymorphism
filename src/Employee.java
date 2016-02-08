/**
 * 
 */

/**
 * @author varsha
 *
 */
public class Employee {
    String name;
    double salary;
    
    Employee(){}
    Employee( String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void printSalary() {
        System.out.println("Employee " + name + " has salary = " + salary);
    }
    
    
}
