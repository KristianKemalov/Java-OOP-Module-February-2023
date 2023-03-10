package Polymorphism.WildFarm.animal;

import Polymorphism.WildFarm.food.Food;
import Polymorphism.WildFarm.food.Vegetable;

public class Zebra extends Mammal {
    public Zebra(String name, Double weight, String region) {
        super(name,weight,region,AnimalType.Zebra);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");

    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Vegetable;
    }


}
