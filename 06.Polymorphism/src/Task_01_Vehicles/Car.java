package Task_01_Vehicles;

/**
 * Created by ivano on 2/19/2017.
 */
public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        fuelConsumption += 0.9d;
        super.setFuelConsumption(fuelConsumption);
    }
}
