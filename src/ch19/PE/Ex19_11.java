package ch19.PE;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class Ex19_11 {
    public static void main(String[] args) {
        IntPredicate isPalindrome = number -> {
            String decimal = number + "";
            for (int i = 0, j = decimal.length() - 1; i < j; i++, j--) {
                if (decimal.charAt(i) != decimal.charAt(j)) {
                    return false;
                }
            }
            return true;
        };

        int n = 10000;
        IntStream.range(10, n)
                .map(i -> i * i)
                .filter(isPalindrome)
                .forEach(System.out::println);
//        Stream.iterate(1, i -> i + 1)
//                .limit(n).map(i -> i * i)
//                .filter(isPalindrome)
//                .forEach(System.out::println);
    }

}

