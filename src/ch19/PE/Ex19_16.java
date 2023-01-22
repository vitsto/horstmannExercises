package ch19.PE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Ex19_16 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words5.txt");
        try (Stream<String> stream = Files.lines(path)) {
            Map<Object, List<String>> collection = stream
                    .flatMap(Pattern.compile("\\s+")::splitAsStream)
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(e -> e.charAt(0)));
            System.out.println(collection);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

