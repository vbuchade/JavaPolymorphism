/**
 * 
 */

/**
 * @author varsha
 *
 */
public class ExecutionClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Employee e = new Employee("abc", 111);
        e.printSalary();
        
        Employee es = new SalesPerson("def", 222);
        es.printSalary();
        
        SalesPerson sp = new SalesPerson("ghi", 333);
        sp.printSalary();

    }

}
