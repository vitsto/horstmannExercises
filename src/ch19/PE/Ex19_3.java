package ch19.PE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex19_3 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words5.txt");
        try (Stream<String> lines = Files.lines(path)) {
           lines.filter(e->e.contains("the")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
