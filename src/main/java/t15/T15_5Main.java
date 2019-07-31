package t15;

import java.io.*;
import java.util.*;

public class T15_5Main {
    private static final String FILE_NAME = "D:\\2.txt";
    private static final Random RANDOM = new Random();
    public static void main(String[] args) throws IOException {
        writeRandomNumbersToFile(FILE_NAME, 5);
        List<Integer> allNumbers = readNumbersFromFile(FILE_NAME);
        System.out.println(Arrays.toString(allNumbers.toArray()));
        System.out.println(calcucateAvg(allNumbers));
    }

    private static double calcucateAvg(List<Integer> allNumbers) {
        double sum = 0;
        for (Integer number : allNumbers) {
            sum += number;
        }
        return sum / allNumbers.size();
    }

    private static List<Integer> readNumbersFromFile(String fileName) throws IOException {
        List<Integer> allNumbers = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            while (dataInputStream.available() > 0) {
                int num = dataInputStream.readInt();
                allNumbers.add(num);
            }
        }
        return allNumbers;
    }

    private static void writeRandomNumbersToFile(String fileName, int numberCount) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for(int i = 0; i < numberCount; ++i) {
                int num = RANDOM.nextInt(2_000_000) + 255;
                dataOutputStream.writeInt(num);
            }
        }
    }
}
