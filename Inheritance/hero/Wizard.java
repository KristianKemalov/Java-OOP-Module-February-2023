package Inheritance.hero;

public class Wizard extends Hero{
    public Wizard(String username, int level) {
        super(username, level);
    }

    @Override
    protected String getUsername() {
        return super.getUsername();
    }

    @Override
    protected int getLevel() {
        return super.getLevel();
    }

    @Override
    public String toString() {
        return String.format(("Type: %s Username: %s Level: %s"), this.getClass().getName(), this.getUsername(), this.getLevel());
    }
}
