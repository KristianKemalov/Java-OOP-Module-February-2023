package Polymorphism.WildFarm.animal;

import Polymorphism.WildFarm.food.Food;
import Polymorphism.WildFarm.food.Meat;

public class Tiger extends Felime {
    private String livingRegion;

    public Tiger(String name, Double weight, String region) {
        super(name, weight, region,AnimalType.Tiger);
        this.livingRegion=region;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Meat;
    }


}
