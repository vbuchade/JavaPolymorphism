/**
 * 
 */

/**
 * @author varsha
 *
 */

public class SalesPerson extends Employee {
    
    SalesPerson(){
        super();
    }
    
    SalesPerson(String name, double salary) {
        super(name, salary);
    }
    
    public void printSalary() {
        System.out.println("Sales Person " + name + " has salary = " + salary);
    }
    
    public void printSalesArea() {
        System.out.println("Sales person " + name + " works in area = Pune");
    }
}
