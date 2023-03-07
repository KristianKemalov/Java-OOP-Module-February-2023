package InterfacesAndAbstraction.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Citizen> citizenList = new ArrayList<>();
        List<Pet> petList = new ArrayList<>();

        String command = sc.nextLine();

        while (!command.equals("End")) {
            String[] data = command.split(" ");

            if (command.startsWith("Citizen")) {
                Citizen citizen = new Citizen(data[1], Integer.parseInt(data[2]), data[3], data[4]);
                citizenList.add(citizen);
            } else if (command.startsWith("Pet")) {
                Pet pet = new Pet(data[1], data[2]);
                petList.add(pet);
            }

            command = sc.nextLine();
        }

        String specificYear = sc.nextLine();


        for (Citizen citizen : citizenList) {
            String[] split = citizen.getBirthDate().split("\\/");
            if (split[2].equals(specificYear)) {
                System.out.println(citizen.getBirthDate());
            }
        }
        for (Pet pet : petList) {
            String[] split = pet.getBirthDate().split("\\/");
            if (split[2].equals(specificYear)) {
                System.out.println(pet.getBirthDate());
            }
        }
    }
}
