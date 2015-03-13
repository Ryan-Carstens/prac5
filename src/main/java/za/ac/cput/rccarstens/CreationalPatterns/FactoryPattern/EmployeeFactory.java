package za.ac.cput.rccarstens.CreationalPatterns.FactoryPattern;

public class EmployeeFactory {

    private static EmployeeFactory employeeFactory = null;

    private EmployeeFactory()
    {
    }

    public static EmployeeFactory getEmployeeFactoryInstance()
    {
        if (employeeFactory == null)
            return new EmployeeFactory();
        return employeeFactory;
    }
    public Employee getEmployeeRole(String employee)
    {
        if (employee.equalsIgnoreCase("Lecturer"))
        {
            return new Lecturer();
        } else {
            return new Secretary();
        }
    }
}
