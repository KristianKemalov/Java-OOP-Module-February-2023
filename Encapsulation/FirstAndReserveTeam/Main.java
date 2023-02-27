import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Team team=new Team("Black Eagles");

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] data = sc.nextLine().split("\\s+");
            int age = Integer.parseInt(data[2]);
            String name = data[0];
            String lastName = data[1];
            double salary = Double.parseDouble(data[3]);


            Person person = new Person(name, lastName, age, salary);
            team.addPlayer(person);

        }

        System.out.printf("First team have %d players%n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n",team.getReserveTeam().size());
    }
}
