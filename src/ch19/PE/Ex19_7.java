package ch19.PE;

import java.util.Currency;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Ex19_7 {
    public static void main(String[] args) {
        Function<String, String> function = e -> {
            if (e.length() < 2) {
                return "";
            } else {
                return e.charAt(0) + "..." + e.charAt(e.length() - 1);
            }
        };

        List<String> words = List.of("letter", "a" ,"jam", "phone", "potato", "ox", "o");
        words.stream()
                .map(function)
                .filter(e -> !e.isEmpty())
                .forEach(System.out::println);


    }
}
