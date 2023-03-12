package Polymorphism.Vehicles;

public class Bus extends Vehicle {
    public static final double AC_ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double km) {
        setFuelConsumption(getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
        String driveResult = super.drive(km);
        setFuelConsumption(getFuelConsumption() - AC_ADDITIONAL_CONSUMPTION);
        return driveResult;

    }

    public  String driveEmpty(double km){
        return super.drive(km);
    }
}
