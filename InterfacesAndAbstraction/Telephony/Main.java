package InterfacesAndAbstraction.Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<String> numsTocall = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        List<String> sitesToBrowse = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numsTocall, sitesToBrowse);


        String resultCalls = smartphone.call();
        String resultBrowse = smartphone.browse();

        System.out.print(resultCalls);
        System.out.print(resultBrowse);
    }
}
