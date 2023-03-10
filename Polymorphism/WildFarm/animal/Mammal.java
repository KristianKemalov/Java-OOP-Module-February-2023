package Polymorphism.WildFarm.animal;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;


    public Mammal(String name, Double weight, String region, AnimalType type) {
        super(name, weight, type);
        this.livingRegion = region;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        String format = decimalFormat.format(getAnimalWeight());
        return String.format("%s[%s, %s, %s, %s]", this.getAnimalType(), this.getAnimalName(), format, this.livingRegion, this.getFoodEaten());
    }
}
