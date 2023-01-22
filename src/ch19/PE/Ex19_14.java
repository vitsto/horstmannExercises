package ch19.PE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Ex19_14 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words5.txt");
        try (Stream<String> stream = Files.lines(path)) {
            ArrayList<String> words = stream
                    .flatMap(Pattern.compile("\\s+")::splitAsStream)
                    .collect(Collectors.toCollection(ArrayList::new));
//            Optional<String> anyPalindrome = words.stream().filter(e -> e.length() >= 5).filter(e -> isPalindrome(e)).findAny();
            Optional<String> anyPalindrome = words.parallelStream()
                    .filter(e -> e.length() >= 5)
                    .filter(e -> isPalindrome(e))
                    .findAny();
            System.out.println(anyPalindrome.orElse("Nothing"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

