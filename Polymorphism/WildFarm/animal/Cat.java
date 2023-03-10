package Polymorphism.WildFarm.animal;

import Polymorphism.WildFarm.food.Food;

public class Cat extends Felime {
    private String breed;

    public Cat(String name, Double weight, String region,String breed) {
        super(name, weight, region,AnimalType.Cat);
        this.breed=breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");

    }

    @Override
    public boolean willEatFood(Food food) {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %s]", this.getAnimalType(), this.getAnimalName(),this.breed, this.getAnimalWeight(), this.getLivingRegion(), this.getFoodEaten());

    }
}
