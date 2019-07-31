package t12;

public class T12_5Main {
    public static void main(String[] args) throws MyNewSuperCustomException {
        try {
            throw new IllegalAccessException("тебе нельзя запускать этот метод");
        } catch (IllegalAccessException e) {
            throw new MyNewSuperCustomException("я тебе шуточки шутить не буду!", e);
        }
    }
}
