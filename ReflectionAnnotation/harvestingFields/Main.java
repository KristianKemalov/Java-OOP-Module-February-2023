package ReflectionAnnotation.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Class<RichSoilLand> aClass = RichSoilLand.class;
        Field[] declaredFields = aClass.getDeclaredFields();

        String command = sc.nextLine();
        Consumer<Field> printer = f -> System.out.printf("%s %s %s\n", Modifier.toString(f.getModifiers()), f.getType().getSimpleName(), f.getName());

        while (!command.equals("HARVEST")) {
            switch (command) {
                case "private":
                    Arrays.stream(declaredFields).filter(f -> Modifier.isPrivate(f.getModifiers()))
                            .forEach(printer);
                    break;
                case "public":
                    Arrays.stream(declaredFields).filter(f -> Modifier.isPublic(f.getModifiers()))
                            .forEach(printer);
                    break;
                case "protected":
                    Arrays.stream(declaredFields).filter(f -> Modifier.isProtected(f.getModifiers()))
                            .forEach(printer);
                    break;
                case "all":
                    Arrays.stream(declaredFields)
                            .forEach(printer);
                    break;

            }


            command = sc.nextLine();

        }

    }
}
