package ch19.PE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex19_4 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words2.txt");
        try (Stream<String> lines = Files.lines(path)) {
            Stream<String> stream = lines
                    .map(e -> e.replace(",", " ").replace(".", " "))
                    .flatMap(Pattern.compile("\\s+")::splitAsStream);
            stream.filter(e -> (e.length() <= 4 && !e.isEmpty())).sorted().distinct().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
