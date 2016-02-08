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
     * 
     * Output
        Employee abc has salary = 111.0
        Sales Person def has salary = 222.0
        Sales Person ghi has salary = 333.0
        Sales person def works in area = Pune
        Sales person ghi works in area = Pune
     */
    public static void main(String[] args) {
        
        Employee e = new Employee("abc", 111);
        e.printSalary();
        
        Employee es = new SalesPerson("def", 222);
        es.printSalary();
        
        SalesPerson sp = new SalesPerson("ghi", 333);
        sp.printSalary();
        
        //es.printSalesArea();
        ((SalesPerson) es).printSalesArea();
        sp.printSalesArea();
        

    }

}
