package t09_5;

public class MyClass {

    public void regularMethod() {
        System.out.println("regular method");
    }

    @Transactional
    public void transactionalMethod() {
        System.out.println("transactional method");
    }
}
