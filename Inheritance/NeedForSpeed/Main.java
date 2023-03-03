package Inheritance.NeedForSpeed;

public class Main {
    public static void main(String[] args) {


        Vehicle ferrari=new SportCar(50,250);
        ferrari.drive(3);
        System.out.println(ferrari.getFuel());
    }
}
