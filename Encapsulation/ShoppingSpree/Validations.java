package ShoppingSpree;

public class Validations {
    public static void ValidateName(String name){
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
    public  static void ValidateAmount(double money){
        if (money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
