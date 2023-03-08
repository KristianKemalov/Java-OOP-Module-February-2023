package FoodShortage;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Citizen> citizenList = new ArrayList<>();
        List<Rebel> rebelList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(" ");
            if (data.length == 4) {
                Citizen citizen = new Citizen(data[0], Integer.parseInt(data[1]), data[2], data[3]);
                citizenList.add(citizen);
            } else {
                Rebel rebel = new Rebel(data[0], Integer.parseInt(data[1]), data[2]);
                rebelList.add(rebel);

            }
        }

        int foodPurchased = 0;
        String command = sc.nextLine();
        while (!command.equals("End")) {
            String name = command;

            citizenList.stream().filter(c -> c.getName().equals(name)).findFirst().ifPresentOrElse(Citizen::buyFood,IllegalArgumentException::new);
            rebelList.stream().filter(c -> c.getName().equals(name)).findFirst().ifPresentOrElse(Rebel::buyFood,IllegalArgumentException::new);


            command = sc.nextLine();
        }
        foodPurchased += citizenList.stream().mapToInt(Citizen::getFood).sum();
        foodPurchased += rebelList.stream().mapToInt(Rebel::getFood).sum();

        System.out.println(foodPurchased);

    }


}