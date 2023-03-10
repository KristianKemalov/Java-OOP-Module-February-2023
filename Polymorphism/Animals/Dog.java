package Polymorphism.Animals;

public class Dog extends Animal {


    protected Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        String result = "I am Rocky and my favourite food is Meat\n" +
                "DJAAF";
        return result;
    }
}
