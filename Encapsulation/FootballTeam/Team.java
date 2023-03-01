package Encapsulation.FootballTeam;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name){
        setName(name);
        this.players=new ArrayList<>();

    }
    private void setName(String name){
        Validations.ValidateName(name);
        this.name=name;

    }

    public String getName() {
        return name;
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public void removePlayer(String name){
        int removeIndex=-1;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(name)){
                removeIndex=i;
                break;
            }
        }
        if (removeIndex==-1){
            throw new IllegalArgumentException("Player "+name+" is not in "+getName()+" team.");
        }
        players.remove(removeIndex);

    }
    public double getRating(){
       return Math.round(this.players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0));

    }
}
