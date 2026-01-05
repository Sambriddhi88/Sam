package week9workshop;


public class employees
{
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    public employees(int employeeId, String name, double basicSalary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateBonus()
    {
        double bonus = basicSalary *+ 0.1;
        return bonus;
    }

    void displayEmployee()
    {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
    }
}
