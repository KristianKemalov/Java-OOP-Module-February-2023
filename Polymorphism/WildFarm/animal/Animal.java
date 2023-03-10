package Polymorphism.WildFarm.animal;

import Polymorphism.WildFarm.food.Food;

public abstract class Animal {
    private String animalName;
    private AnimalType animalType;

    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String name, Double weight,AnimalType type) {
        this.animalName = name;
        this.animalWeight = weight;
        this.foodEaten=0;
        this.animalType=type;


    }


    public abstract void makeSound();

    public abstract boolean willEatFood(Food food);
    public  void eat(Food food){
        if (!willEatFood(food)){
            System.out.printf("%ss are not eating that type of food!%n",this.animalType.name());
            return;
        }
        this.foodEaten+=food.getQuantity();
    }

    protected Double getAnimalWeight() {
        return animalWeight;
    }

    protected Integer getFoodEaten() {
        return foodEaten;
    }

    protected String getAnimalName() {
        return animalName;
    }

    protected AnimalType getAnimalType() {
        return animalType;
    }
}
