package InterfacesAndAbstraction.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Identifiable> inhabitants = new ArrayList<>();

        String input = sc.nextLine();

        while (!input.equals("End")) {
            String[] parts = input.split(" ");

            Identifiable next;
            if (parts.length == 2) {
                next = new Robot((parts[0]), parts[1]);
            } else {
                next = new Citizen(parts[0],Integer.parseInt(parts[1]),parts[2]);
            }

            inhabitants.add(next);


            input = sc.nextLine();
        }

        String badID = sc.nextLine();
        inhabitants.stream().
                map(Identifiable::getId).
                filter(id -> id.endsWith(badID)).
                forEach(System.out::println);

    }
}
