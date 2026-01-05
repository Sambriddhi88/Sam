package week9workshop;



public class vehicle

{
    protected int vehicleId;
    protected String brand;
    protected double basePrice;

    public vehicle(int vehicleId, String brand, double basePrice)
    {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    void displayVehicleInfo()
    {
        System.out.println("Vehicle ID: " + this.vehicleId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Base Price: " + this.basePrice);
    }

    double calculateTax()
    {
        double Price = basePrice *+ 0.1;
        return Price;
    }
}
