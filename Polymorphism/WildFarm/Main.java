package Polymorphism.WildFarm;


import Polymorphism.WildFarm.animal.*;
import Polymorphism.WildFarm.food.Food;
import Polymorphism.WildFarm.food.FoodType;
import Polymorphism.WildFarm.food.Meat;
import Polymorphism.WildFarm.food.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("End")) {
            String[] animalInfo = input.split(" ");
            String[] foodInfo = sc.nextLine().split(" ");

            Animal animal = createAnimal(animalInfo);
            Food food = createFood(foodInfo);
            animal.makeSound();
            animal.eat(food);
            System.out.println(animal);

            input = sc.nextLine();
        }

    }

    private static Food createFood(String[] foodInfo) {
        Food result = null;
        FoodType foodType = FoodType.valueOf(foodInfo[0]);
        Integer quantity = Integer.parseInt(foodInfo[1]);

        if (foodType == FoodType.Meat) {
            result=new Meat(quantity);

        }else if (foodType==FoodType.Vegetable){
            result=new Vegetable(quantity);
        }
        return result;
    }


    private static Animal createAnimal(String[] animalInfo) {
        AnimalType type = AnimalType.valueOf(animalInfo[0]);
        Animal result = null;

        if (type == AnimalType.Cat) {
            result = new Cat(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]);
        } else if (type == AnimalType.Mouse) {
            result = new Mouse(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
        } else if (type == AnimalType.Tiger) {
            result = new Tiger(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
        } else if (type == AnimalType.Zebra) {
            result = new Zebra(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
        }
        return result;
    }
}
