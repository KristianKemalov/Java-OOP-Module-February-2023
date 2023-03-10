package Polymorphism.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity=tankCapacity;
    }

    public double getTrunkCapacity() {
        return tankCapacity;
    }

    public void setTrunkCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (fuelQuantity + liters > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    public String drive(double km) {
        double neededFuel = km * this.getFuelConsumption();
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        if (neededFuel > getFuelQuantity()) {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
        setFuelQuantity(getFuelQuantity() - neededFuel);
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(km));

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), fuelQuantity);
    }
}
