package Encapsulation.FootballTeam;

public class Validations {
    public static void ValidateName(String name){
        if (name==null||name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }
    public static void ValidateStat(String name,int amount){
        if (amount<0||amount>100){
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.",name));
        }
    }
}
