package Polymorphism.Animals;

public class Cat extends Animal{


    protected Cat(String name, String favouriteFood) {
        super(name,favouriteFood);

    }

    @Override
    public String explainSelf() {
        String result = "I am Oscar and my favourite food is Whiskas\n" +
                "MEEOW";
        return result;
    }
}
