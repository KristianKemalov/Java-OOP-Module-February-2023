package ReflectionAnnotation.blackBoxInteger;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner sc = new Scanner(System.in);

        int start = 0;

        Class<BlackBoxInt> aClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();


        String command = sc.nextLine();

        Field hiddenValue = aClass.getDeclaredField("innerValue");
        hiddenValue.setAccessible(true);

        while (!command.equals("END")) {
            String[] parts = command.split("_");
            String methodName = parts[0];
            int argument = Integer.parseInt(parts[1]);

            Method method = aClass.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, argument);


            System.out.println(hiddenValue.get(blackBoxInt));

            command = sc.nextLine();

        }
    }
}
