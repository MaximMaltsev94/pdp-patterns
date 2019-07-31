package t15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class T15_4Main {
    private static final String FILE_NAME = "C:\\1.txt";
    private static final String ALL_NOT_DIGIT_SYMBOLS = "[^\\d]+";

    public static void main(String[] args) throws IOException {
        List<String> allWordsInFile = getAllWords(FILE_NAME);
        System.out.println(Arrays.toString(allWordsInFile.toArray()));
    }

    private static List<String> getAllWords(String fileName) throws IOException {
        List<String> allWordsInText = new ArrayList<>();

        // Reader а не InputStream потому что работаем с текстом
        //прочитай про try with resources
        try (BufferedReader fileInputStream = new BufferedReader(new FileReader(fileName))) {
            String line;

            int lineNumber = 1;
            while ((line = fileInputStream.readLine()) != null) {
                System.out.println(lineNumber + " - " + findBiggestDigitSequence(line));
                lineNumber++;
            }
        }

        return allWordsInText;
    }

    private static String findBiggestDigitSequence(String line) {

        String[] allNumbers = line.split(ALL_NOT_DIGIT_SYMBOLS);
        if(allNumbers.length > 0) {
            return Collections.max(Arrays.asList(allNumbers), Comparator.comparingInt(String::length));
        } else {
            return "";
        }
    }
}
