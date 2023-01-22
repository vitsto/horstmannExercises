package ch19.PE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex19_9 {
    public static void main(String[] args) {
        Path path = Path.of("src/ch19/PE/words3.txt");
        System.out.println("Введите слово: ");
        String word = new Scanner(System.in).next();
        try (Stream<String> stream = Files.lines(path)) {
            //подробно
//            Stream<String> allWords = stream.map(e -> e.split(" ")).flatMap(Arrays::stream);
//            Stream<String> wordsWithGivenWord = allWords.filter(w -> w.contains(word));
//            String result = wordsWithGivenWord.max(String::compareTo).orElse("");

            //кратко
            String result = stream.map(e -> e.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .filter(w -> w.contains(word))
                    .max(String::compareTo)
                    .orElse("Слово не найдено");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
