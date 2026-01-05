package Week9T;



public class Car extends Vehicle
{
    private int doors;
     
    public Car(String brandName, int maxSpeed, int doors)
    {
        super(brandName, maxSpeed);
        this.doors= doors;
    
    
    }
    
    
    public void displayCarDetails()
    { 
        System.out.println("Car brand Name:  "+ super.brandName);
        System.out.println("Car Speed:  "+ super.maxSpeed);
        System.out.println("No of doors:  "+ this.doors);
    
    
    }
    
}