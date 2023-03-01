package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] pizzaData = sc.nextLine().split(" ");
        String pizzaName = pizzaData[1];
        int toppingCount = Integer.parseInt(pizzaData[2]);

        String[] doughData = sc.nextLine().split(" ");
        String doughFlour = doughData[1];
        String doughBaking = doughData[2];
        double weight = Double.parseDouble(doughData[3]);

        try {
            Pizza pizza = new Pizza(pizzaName, toppingCount);
            Dough dough = new Dough(doughFlour, doughBaking, weight);
            pizza.setDough(dough);

            String command = sc.nextLine();
            while (!command.equals("END")) {
                String[] toppingInfo = command.split(" ");
                String toppingName = toppingInfo[1];
                double toppingWeight = Double.parseDouble(toppingInfo[2]);

                Topping topping = new Topping(toppingName, toppingWeight);
                pizza.addTopping(topping);


                command = sc.nextLine();
            }
            System.out.printf("%s - %.2f",pizza.getName(),pizza.getOverallCalories());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
