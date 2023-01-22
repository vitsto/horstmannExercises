package ch19.PE;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Ex19_12 {
    public static void main(String[] args) {
        characters("Столяров Виталий\udbff\udfff\udbff\udfff").forEach(System.out::println);

        characters("\ufeff\u03e2").forEach(System.out::println);

    }


    public static Stream<String> characters(String str) {
        IntFunction<String> mapper = i -> {
            if (i > 65535) {
                String hex = Integer.toHexString(i);
                int decimal1 = Integer.parseInt(hex.substring(0, hex.length() - 4), 16);
                int decimal2 = Integer.parseInt(hex.substring(hex.length() - 4), 16);
                return (char) decimal1 + "" + (char) decimal2;
            }
            return (char) i + "";
        };


        return str.codePoints().mapToObj(mapper);
    }

}

