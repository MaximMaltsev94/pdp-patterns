package t15;

import java.io.File;
import java.io.IOException;

public class T15_6Main {
    private static final String DIR_NAME = "D:\\downloads";

    public static void main(String[] args) throws IOException {
        printFiles(new File(DIR_NAME));
    }

    public static void printFiles(File dir) throws IOException {
        if(dir == null || !dir.isDirectory()) {
            return;
        }
        for (File file : dir.listFiles()) {
            System.out.println(dir.getCanonicalPath() + File.separator + file.getName());
            if (dir.isDirectory()) {
                printFiles(file);
            }
        }

    }
}
