package ch19.PE.Ex19_8;

import java.util.Arrays;
import java.util.Comparator;

public class Ex19_8 {
    public static void main(String[] args) {
        Comparator<BankAccount> byBalanceThenByFullName = ((o1, o2) -> {
            int difference = o1.getBalance() - o2.getBalance();
            if (difference == 0) {
                return o1.getFullName().compareToIgnoreCase(o2.getFullName());
            }
            return difference;
        });

        BankAccount[] bankAccounts = {
                new BankAccount("Ivanov I.I", 1250),
                new BankAccount("Petrov P.P", 925),
                new BankAccount("Uzhov R.R", 1165),
                new BankAccount("Sidorov S.S", 1165),
                new BankAccount("Zhukov A.V", 2155),
                new BankAccount("Kotov K.K", 2065),
                new BankAccount("Ermakov E.E", 815)
        };

        Arrays.sort(bankAccounts, byBalanceThenByFullName);
        Arrays.stream(bankAccounts).forEach(System.out::println);


    }
}
