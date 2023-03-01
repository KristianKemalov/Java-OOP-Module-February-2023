package ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
       setName(name);
       setCost(cost);
    }

    private void setName(String name) {
        Validations.ValidateName(name);
        this.name=name;
    }

    private void setCost(double cost) {
        Validations.ValidateAmount(cost);
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
