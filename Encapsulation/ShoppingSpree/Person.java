package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;

    private List<Product> products;


    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products=new ArrayList<>();
    }

    private void setMoney(double money) {
        Validations.ValidateAmount(money);
        this.money=money;
    }

    private void setName(String name) {
        Validations.ValidateName(name);
        this.name=name;
    }

    public void buyProduct(Product product){

        if (this.money>=product.getCost()){
            this.products.add(product);
            this.money-=product.getCost();
        }else {
            throw new IllegalStateException(this.name+" can't afford "+product.getName());
        }

    }

    public String getName() {
        return name;
    }
}
