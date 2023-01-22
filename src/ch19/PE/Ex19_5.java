package ch19.PE;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex19_5 {
    public static void main(String[] args) {
        System.out.println(toString(Stream.generate(() -> (int) (Math.random() * 100)), 5));
        System.out.println(toString(Stream.of("Sunday", "Monday", "Tuesday",
                "Wednesday", "Thirsday", "Friday", "Saturday"), 3));
    }

    public static <T> String toString(Stream<T> stream, int n) {
        return stream.limit(n).collect(Collectors.toList()).toString();
    }
}
