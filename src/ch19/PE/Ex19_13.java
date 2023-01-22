package ch19.PE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Ex19_13 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words4.txt");
        try (Stream<String> stream = Files.lines(path)) {
            String maxWord = stream.flatMap(Pattern.compile("\\s+")::splitAsStream)
                    .max(Comparator.comparing(Ex19_13::getCountOfVowels)).orElse("Nothing");
            System.out.println(maxWord);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static long getCountOfVowels(String str) {
        return str.codePoints().filter(e -> e == 'a' || e == 'e' || e == 'u' || e == 'o' || e == 'i').count();
    }

}

