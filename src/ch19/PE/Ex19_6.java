package ch19.PE;

import java.util.Currency;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex19_6 {
    public static void main(String[] args) {
        Set<Currency> availableCurrencies = Currency.getAvailableCurrencies();
        availableCurrencies.stream().map(Currency::getDisplayName).sorted().forEach(System.out::println);


    }
}
