package t09_6;

import java.util.ArrayList;

public class T09_6Main {
    public static void main(String[] args) {
        ClassAnalyzer classAnalyzer = new ClassAnalyzer();
        classAnalyzer.analyze(ArrayList.class);

        classAnalyzer.analyze(String.class);
    }
}
