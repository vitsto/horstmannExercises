package ch19.PE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex19_2 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words5.txt");
        try (Stream<String> lines = Files.lines(path)) {
//            Stream<String> stream = lines.flatMap(Pattern.compile("\\s+")::splitAsStream);
            Stream<String> stream = lines.map(e -> e.split(" ")).flatMap(Arrays::stream);
            long count = stream.filter(e -> e.contains("the")).count();
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
