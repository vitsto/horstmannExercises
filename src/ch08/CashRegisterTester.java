package ch08;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A class to test the CashRegister class.
 */
public class CashRegisterTester {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.0, "Dollar");
        final Coin QUARTER = new Coin(0.25, "Quarter");
        final Coin DIME = new Coin(0.1, "Dime");
        final Coin NICKEL = new Coin(0.05, "Nickel");
        final Coin PENNY = new Coin(0.01, "Penny");

        CashRegister register = new CashRegister();


        register.recordPurchase(19.96);
        register.receivePayment(50, DOLLAR);


        int countOfDollarCoins = register.giveChange(DOLLAR);
        int countOfQuarterCoins = register.giveChange(QUARTER);
        int countOfDimeCoins = register.giveChange(DIME);
        int countOfNickelCoins = register.giveChange(NICKEL);
        int countOfPennyCoins = register.giveChange(PENNY);

        System.out.println("Dollar coins: " + countOfDollarCoins +
                ", Quarter coins: " + countOfQuarterCoins +
                ", Dime coins: " + countOfDimeCoins +
                ", Nickel coins: " + countOfNickelCoins +
                ", Penny coins: " + countOfPennyCoins);
    }
}

