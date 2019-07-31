package t09_5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransactionalAnalyser {
    public <T> void analyze(Class<T> myClass, T object) {
        for (Method method : myClass.getDeclaredMethods()) {
            try {

                if (method.isAnnotationPresent(Transactional.class)) {
                    System.out.println("transaction start");
                    method.invoke(object);
                    System.out.println("transaction end");
                } else {
                    method.invoke(object);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
    }
}
