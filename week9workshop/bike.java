package week9workshop;



public class bike extends vehicle
{
    double engineCapacity;

    public bike(int vehicleId, String brand, double basePrice, double engineCapacity)
    {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    double afterTax = basePrice + calculateTax();

    double CalculateFinalPrice()
    {
        double finalPrice = afterTax;
        return finalPrice;
    }
}
