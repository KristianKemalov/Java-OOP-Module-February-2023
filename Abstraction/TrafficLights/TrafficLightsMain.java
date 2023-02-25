package Abstraction.TrafficLights;

import java.util.Scanner;

public class TrafficLightsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] trafficLightsLine = sc.nextLine().split("\\s+");

        TrafficLight[] trafficLights = new TrafficLight[trafficLightsLine.length];
        for (int i = 0; i < trafficLightsLine.length; i++) {
            String s = trafficLightsLine[i];
            TrafficLight.Signal signal = TrafficLight.Signal.valueOf(s);
            trafficLights[i] = new TrafficLight(signal);
        }

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            updateTrafficLights(trafficLights);
            printTrafficLights(trafficLights);
        }
    }

    private static void printTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            System.out.print(trafficLight.getSignal()+" ");

        }
        System.out.println();
    }

    private static void updateTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            trafficLight.update();

        }


    }
}
