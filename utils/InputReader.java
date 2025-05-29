package utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InputReader {
    public static List<String> readLines(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}