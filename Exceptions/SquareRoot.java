package Exceptions;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        try {
            System.out.printf("%.2f%n",sqrt(n));
        } catch (IllegalArgumentException ignored) {
            System.out.println("Invalid");
        }
        System.out.println("Goodbye");
    }

    private static double sqrt(String n) {
        int number = Integer.parseInt(n); 

        if (number < 0) {
            throw new IllegalArgumentException("Number " + number + " is negative!");
        }


        return Math.sqrt(number);

    }
}
