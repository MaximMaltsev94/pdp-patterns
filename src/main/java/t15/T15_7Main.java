package t15;

import java.io.*;
import java.util.Arrays;

public class T15_7Main {
    private static final String FILE_NAME = "C:\\T15_7Main.java";
    private static final String OUTPUT_FILE_NAME = "D:\\avaj.niaM7_51T";

    public static void main(String[] args) throws IOException {
        copyContentReversed(FILE_NAME, OUTPUT_FILE_NAME);
    }

    private static void copyContentReversed(String fileName, String outputFileName) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                writer.println(reverseString(line));
            }
        }
    }

    private static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
