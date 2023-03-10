package Polymorphism.WildFarm.animal;

import Polymorphism.WildFarm.food.Food;
import Polymorphism.WildFarm.food.Vegetable;

public class Mouse extends Mammal {


    public Mouse(String name, Double weight, String region) {
        super(name, weight, region,AnimalType.Mouse);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Vegetable;
    }


}
