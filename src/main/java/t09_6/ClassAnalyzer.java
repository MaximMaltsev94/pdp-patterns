package t09_6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassAnalyzer {
    public <T> void analyze(Class<T> claszz) {
        System.out.println("CLASS: " + claszz.getName());
        System.out.println("----------------------------\\");
        System.out.println("mehtods: ");
        for (Method method : claszz.getMethods()) {
            StringBuilder methodParameters = new StringBuilder();
            for (Class<?> parameterType : method.getParameterTypes()) {
                methodParameters.append(parameterType.getName());
                methodParameters.append(",");
            }
            System.out.println("method : " + method.getName() + "(" + methodParameters.toString() + ")");
        }
        System.out.println("----------------------------//");


        System.out.println("----------------------------\\");
        System.out.println("fields: ");
        for (Field field : claszz.getDeclaredFields()) {
            System.out.println("field : " + field.getName());
        }
        System.out.println("----------------------------//");


        System.out.println("----------------------------\\");
        System.out.println("constructors: ");
        for (Constructor<?> constructor : claszz.getConstructors()) {

            StringBuilder constructorParameters = new StringBuilder();
            for (Class<?> parameterType : constructor.getParameterTypes()) {
                constructorParameters.append(parameterType.getName());
                constructorParameters.append(",");
            }
            System.out.println("constructor : " + constructor.getName() + "(" + constructorParameters + ")");
        }
        System.out.println("----------------------------//");
    }
}
