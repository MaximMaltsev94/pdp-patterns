package pdp.patterns.state;

public class StateMain {
    public static void main(String[] args) {
        ImportantClass importantClass = new ImportantClass();

        importantClass.doAction();

        importantClass.setImportantData(20);

        importantClass.doAction();
    }
}
