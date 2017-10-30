package Task_01_Vehicles;

/**
 * Created by ivano on 2/19/2017.
 */
public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        fuelConsumption += 1.6d;
        super.setFuelConsumption(fuelConsumption);
    }

    @Override
    public void refuel(Double amount) {
        amount = amount * 0.95d;
        super.refuel(amount);
    }

}
