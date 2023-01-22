package ch19.PE;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex19_1 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words5.txt");
        try (Stream<String> stream = Files.lines(path)) {
            long count = stream.filter(e -> e.contains("the")).count();
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
