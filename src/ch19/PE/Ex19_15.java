package ch19.PE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Ex19_15 {
    public static void main(String[] args) {
        Path source = Path.of("src/ch19/PE/words5.txt");
        Path output = Path.of("src/ch19/PE/Ex19_15Output.txt");
        Map<Integer, List<String>> collection;


        try (Stream<String> stream = Files.lines(source)) {
            Stream<String> words = stream.flatMap(Pattern.compile("\\s+")::splitAsStream);
            collection = getCollection(words, String::length);
            System.out.println(collection);
            writeToDataFile(collection, output);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static <T, R> Map<T, List<R>> getCollection(Stream<R> stream, Function<R, T> function) {
        return stream.collect(Collectors.groupingBy(function));
    }

    public static void writeToDataFile(Map<Integer, List<String>> data, Path path) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(path.toString())) {
            data.forEach((k, v) -> {
                out.print(k + ": " + v + "\n");
            });
        }
    }
}

