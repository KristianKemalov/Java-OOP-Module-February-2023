package ReflectionAnnotation.GettersSetters;

import kotlin.jvm.internal.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;

        Method[] allMethods = reflectionClass.getDeclaredMethods();

        Arrays.stream(allMethods)
                .filter(Main::isGetterMethod)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s will return class %s%n", m.getName(), m.getReturnType().getName()));

        Arrays.stream(allMethods)
                .filter(Main::isSetterMethod)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s and will set field of class %s%n", m.getName(), m.getParameterTypes()[0].getName()));

    }

    private static boolean isSetterMethod(Method method) {

        if (!method.getName().startsWith("set")){return false;}
        if (!method.getReturnType().equals(void.class)){return false;}
        if (method.getParameterCount()!=1){return false;}
        return true;

    }

    private static boolean isGetterMethod(Method m) {

        if (!m.getName().startsWith("get")) {return false;}
        if (m.getReturnType().equals(void.class)) {return false;}
        if (m.getParameterCount() > 0) {return false;}
        return true;

    }
}
