package Inheritance.hero;

public class Hero {
    protected String username;
    protected int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    protected String getUsername() {
        return username;
    }

    protected int getLevel() {
        return level;
    }



    @Override
    public String toString() {
        return "Hero{" +
                "username='" + username + '\'' +
                ", level=" + level +
                '}';
    }
}
