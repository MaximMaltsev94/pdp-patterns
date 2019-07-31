package t15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T15_3Main {
    private static final String FILE_NAME = "C:\\1.txt";
    private static final String ALL_SIGNS_REGEX = "[\\.,!?\\-\\s—\\n\\r]+";

    public static void main(String[] args) throws IOException {
        List<String> allWordsInFile = getAllWords(FILE_NAME);
        System.out.println(Arrays.toString(allWordsInFile.toArray()));

        for(int i = 0; i + 1 < allWordsInFile.size(); ++i) {
            String word = allWordsInFile.get(i);
            String nextWord = allWordsInFile.get(i + 1);
            if(lastLetter(word) == firstLetter(nextWord)) {
                System.out.println(word + " - " + nextWord);
            }
        }
    }

    private static List<String> getAllWords(String fileName) throws IOException {
        List<String> allWordsInText = new ArrayList<>();

        // Reader а не InputStream потому что работаем с текстом
        try (BufferedReader fileInputStream = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileInputStream.readLine()) != null) {
                String[] wordsInLine = line.split(ALL_SIGNS_REGEX);
                allWordsInText.addAll(Arrays.asList(wordsInLine));
            }
        }

        return allWordsInText;
    }

    private static char lastLetter(String word) {
        if(word.length() > 0) {
            return word.charAt(word.length() - 1);
        } else {
            return 1;
        }
    }

    private static char firstLetter(String word) {
        if(word.length() > 0) {
            return word.charAt(0);
        } else {
            return 0;
        }
    }
}
