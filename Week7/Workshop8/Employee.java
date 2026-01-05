package Week7.Workshop8;



public class Employee
{
private double basicsalary;
private double grosssal;
public Employee (double basicsalary){
this.basicsalary=basicsalary;
}
public void setbasicsalary(double basicsalary){

this.basicsalary = basicsalary;
}

public double getbasicsalary()
{

return this.basicsalary;
}
public double grosssalary(){
grosssal= basicsalary + 0.2 * basicsalary;

return grosssal;
}
public void display(){
System.out.println("Salary: "+this.basicsalary);
System.out.println("Gross salary: "+this.grosssal);
}
}