package OOPs.Inheritance.Employee.HybridInheritance;

public class BusinessDevelopmentManager extends MarketingManager implements SalesManager {

    public BusinessDevelopmentManager(String empName, int empId){
        super(empName, empId);
    }

    public void coordinateBusinessDevelopment(){
        createMarketingStrategy();
        boostSales();
        System.out.println("Business Development Manager coordinating business efforts.");
    }


    @Override
    public void boostSales() {
        System.out.println("Sales Manager boosting sales.");
    }
}
