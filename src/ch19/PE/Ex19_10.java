package ch19.PE;

import java.util.Optional;
import java.util.stream.Stream;

public class Ex19_10 {
    public static void main(String[] args) {
        System.out.println(smallestProperDivisor(11).get());
    }

    public static Optional<Integer> smallestProperDivisor(int n) {
        Optional<Integer> min = Stream.iterate(2, i -> i + 1)
                .limit(n)
                .filter(i -> n % i == 0)
                .filter(i -> i != n)
                .min(Integer::compareTo);
        if (min.isEmpty()) {
            return Optional.of(-1);
        }
        return min;
    }


}
