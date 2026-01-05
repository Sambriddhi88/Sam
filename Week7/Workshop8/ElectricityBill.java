package Week7.Workshop8;



public class ElectricityBill
 {
private String consumerName;
private int unitsConsumed;

public ElectricityBill(String consumerName,int unitsConsumed)
{
this.consumerName=consumerName;
this.unitsConsumed=unitsConsumed;
}

void setUnitsConsumed(int unitsConsumed)
{
this.unitsConsumed=unitsConsumed;
}

int getUnitsConsumed()
{
return this.unitsConsumed;
}

double calculateBill()
{
if(unitsConsumed<=100)
{
double cost = unitsConsumed*5;
return cost;
}
else
{
double cost=(unitsConsumed-100)*8+500;
return cost;
}
}
}
