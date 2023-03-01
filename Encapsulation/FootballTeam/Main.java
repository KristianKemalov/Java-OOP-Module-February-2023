package Encapsulation.FootballTeam;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Team> teamsByName = new HashMap<>();

        Team team = null;


        String command = sc.nextLine();

        while (!command.equals("END")) {
            String[] commandInfo = command.split(";");
            String currentCommand = commandInfo[0];
            String currentTeam = commandInfo[1];

            switch (currentCommand) {
                case "Team":
                    try {
                        team = new Team(currentTeam);
                        teamsByName.put(team.getName(), team);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Add":
                    String playerName = commandInfo[2];
                    int endurance = Integer.parseInt(commandInfo[3]);
                    int sprint = Integer.parseInt(commandInfo[4]);
                    int dribble = Integer.parseInt(commandInfo[5]);
                    int passing = Integer.parseInt(commandInfo[6]);
                    int shooting = Integer.parseInt(commandInfo[7]);


                    if (!teamsByName.containsKey(currentTeam)) {
                        System.out.printf("Team %s does not exist.%n", currentTeam);

                    } else {
                        try {
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            teamsByName.get(currentTeam).addPlayer(player);

                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "Remove":
                    try {
                        teamsByName.get(currentTeam).removePlayer(commandInfo[2]);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Rating":
                    DecimalFormat format = new DecimalFormat("0.#");
                    if (teamsByName.containsKey(currentTeam)) {
                        System.out.println(currentTeam + " - " + format.format(teamsByName.get(currentTeam).getRating()));
                    } else {
                        System.out.printf("Team %s does not exist.%n", currentTeam);

                    }

                    break;
            }


            command = sc.nextLine();
        }

    }
}

