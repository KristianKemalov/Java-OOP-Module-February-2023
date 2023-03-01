package Encapsulation.FootballTeam;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setPassing(passing);
        setShooting(shooting);
        setDribble(dribble);
    }

    private void setName(String name) {
        Validations.ValidateName(name);
        this.name = name;
    }

    private void setEndurance(int endurance) {
        Validations.ValidateStat("Endurance", endurance);
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        Validations.ValidateStat("Sprint", sprint);

        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        Validations.ValidateStat("Dribble", dribble);

        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        Validations.ValidateStat("Passing", passing);

        this.passing = passing;
    }

    public String getName() {
        return name;
    }

    private void setShooting(int shooting) {
        Validations.ValidateStat("Shooting", shooting);

        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        return (shooting + passing + sprint + dribble + endurance) / (double)5;
    }
}
