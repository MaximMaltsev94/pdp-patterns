package t10_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T10_6Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = console.nextLine();

        List<String> words = new ArrayList<>();
        List<Integer> wordsCount = new ArrayList<>();

        for (String word : text.split("[\\.,!?\\-\\s]+")) {
            int indexOfWord = words.indexOf(word);
            if(indexOfWord == -1) {
                words.add(word);
                wordsCount.add(1);
            } else {
                int wordCount = wordsCount.get(indexOfWord);
                wordsCount.set(indexOfWord, wordCount + 1);
            }
        }

        for(int i = 0; i < words.size(); ++i) {
            System.out.println(words.get(i) + " - " + wordsCount.get(i));
        }
    }
}
