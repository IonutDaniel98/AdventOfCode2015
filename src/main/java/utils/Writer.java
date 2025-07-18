package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Writer {
    public void writeToFile(Integer day, List<String> linesToWrite) {
        Path outputPath = Paths.get("src", "main", "java", "files", "output", "day_" + day.toString() + ".txt");

        try {
            Files.write(outputPath, linesToWrite);
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }
}
