package week9workshop;



public class PermanentEmployee extends employees
{
    private double HRA;
    private double DA;

    public PermanentEmployee(int employeeId, String name, double basicSalary, double HRA, double DA)
    {
        super(employeeId, name, basicSalary);
        this.HRA = HRA;
        this.DA = DA;
    }

    double calculateTotalSalary()
    {
        double total = basicSalary + HRA + DA + calculateBonus();
        return total;
    }
}
