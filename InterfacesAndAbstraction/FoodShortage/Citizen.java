package FoodShortage;

public class Citizen implements Person, Birthable, Identifiable,Buyer {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food=0;

    @Override
    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void buyFood() {
        this.food+=10;

    }

    @Override
    public int getFood() {
        return food;
    }
}
