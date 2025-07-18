package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<String> getFileContent(Integer day) {
        Path inputPath = Paths.get("src", "main", "java", "files", "input", "day_" + day.toString() + ".txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(inputPath);
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
        return lines;
    }
}
