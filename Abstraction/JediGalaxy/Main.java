package Abstraction.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] galaxyMatrix = readAndInitializeMatrix(scanner);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] JediCoords = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoords = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            moveEvilAndDestroyStars(galaxyMatrix, evilCoords);
            sum += moveJediAndAddStars(galaxyMatrix, JediCoords);

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }


    private static long moveJediAndAddStars(int[][] galaxyMatrix, int[] JediCoords) {
        int JediRow = JediCoords[0];
        int JediCol = JediCoords[1];

        long sum = 0;
        while (canJediStillMove(galaxyMatrix, JediRow, JediCol)) {

            if (isInMatrix(galaxyMatrix, JediRow, JediCol)) {
                sum += galaxyMatrix[JediRow][JediCol];
            }

            JediRow--;
            JediCol++;
        }
        return sum;
    }

    private static boolean isInMatrix(int[][] galaxyMatrix, int JediRow, int JediCol) {
        int galaxyMatrixColumnsLength = galaxyMatrix[0].length;
        return JediRow >= 0 && JediRow < galaxyMatrix.length && JediCol >= 0 && JediCol < galaxyMatrixColumnsLength;
    }

    private static boolean canJediStillMove(int[][] galaxyMatrix, int JediRow, int JediCol) {
        int galaxyMatrixColumnsLength = galaxyMatrix[1].length;
        return JediRow >= 0 && JediCol < galaxyMatrixColumnsLength;
    }

    private static void moveEvilAndDestroyStars(int[][] galaxyMatrix, int[] evilCoords) {
        int evilRow = evilCoords[0];
        int evilCol = evilCoords[1];

        while (canEvilStillMove(evilRow, evilCol)) {

            if (isInMatrix(galaxyMatrix, evilRow, evilCol)) {
                galaxyMatrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static boolean canEvilStillMove(int evilRow, int evilCol) {
        return evilRow >= 0 && evilCol >= 0;
    }

    private static int[][] readAndInitializeMatrix(Scanner scanner) {
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimensions[0];
        int y = dimensions[1];

        int[][] matrix = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
