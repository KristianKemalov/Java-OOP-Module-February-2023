package ReflectionAnnotation.HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        Field[] declaredFields = reflectionClass.getDeclaredFields();
        Method[] declaredMethods = reflectionClass.getDeclaredMethods();



        Arrays.stream(declaredFields)
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.printf("%s must be private!%n", f.getName()));

        Arrays.stream(declaredMethods)
                .filter(Main::isGetterMethod)
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be public!%n", m.getName()));

        Arrays.stream(declaredMethods)
                .filter(Main::isSetterMethod)
                .filter(s -> !Modifier.isPrivate(s.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(s -> System.out.printf("%s have to be private!%n", s.getName()));
    }

    private static boolean isGetterMethod(Method m) {

        if (!m.getName().startsWith("get")) {
            return false;
        }
        if (m.getReturnType().equals(void.class)) {
            return false;
        }
        if (m.getParameterCount() > 0) {
            return false;
        }
        return true;

    }

    private static boolean isSetterMethod(Method method) {

        if (!method.getName().startsWith("set")) {
            return false;
        }
        if (!method.getReturnType().equals(void.class)) {
            return false;
        }
        if (method.getParameterCount() != 1) {
            return false;
        }
        return true;

    }
}
