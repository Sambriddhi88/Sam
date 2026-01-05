package week9workshop;


public class ContractEmployee extends employees
{
    private int workingDays;

    public ContractEmployee(int employeeId, String name, double basicSalary, int workingDays)
    {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    double CalculateTotalSalary()
    {
        double total = basicSalary * workingDays;
        return total;
    }
}
