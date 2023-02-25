package Abstraction.Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] coordinates = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bottomLeftX=coordinates[0];
        int bottomLeftY=coordinates[1];
        int topRightX=coordinates[2];
        int topRightY=coordinates[3];


        Point bottomLeft=new Point(bottomLeftX,bottomLeftY);
        Point topRight=new Point(topRightX,topRightY);
        Rectangle rectangle=new Rectangle(bottomLeft,topRight);

        int countPoints=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < countPoints; i++) {
            int[] currentCoordinates = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int currentX=currentCoordinates[0];
            int currentY=currentCoordinates[1];
            Point searchedPoint=new Point(currentX,currentY);
            System.out.println(rectangle.contains(searchedPoint));

        }
    }
}
