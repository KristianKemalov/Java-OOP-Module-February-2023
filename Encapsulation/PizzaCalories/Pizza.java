package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;

    private List<Topping> toppings;


    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
        this.toppings=new ArrayList<>();

    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int countOfToppings) {
        if (countOfToppings > 10 || countOfToppings < 0) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = toppings;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getOverallCalories() {
        return dough.calculateCalories()+toppings.stream().mapToDouble(Topping::calculateCalories).sum();

    }
}
