package ch08;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister {
    private double purchase;
    private double payment;
    private double returnedSum;


    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister() {
        purchase = 0;
        payment = 0;
        returnedSum = 0;
    }

    /**
     * Records the purchase price of an item.
     *
     * @param amount the price of the purchased item
     */
    public void recordPurchase(double amount) {
        purchase = purchase + amount;
    }

    /**
     * Enters the payment received from the customer.
     *
     * @param coinCount the number of coins received
     * @param coinType  the type of coin that was received
     */
    public void receivePayment(int coinCount, Coin coinType) {
        payment = payment + coinCount * coinType.getValue();
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     *
     * @return the change due to the customer
     */
    public int giveChange(Coin coinType) {
        double change = new BigDecimal(payment - purchase - returnedSum).setScale(2, RoundingMode.HALF_UP).doubleValue();
        int numberOfCoins = 0;
        switch (coinType.getName()) {
            case "Dollar":
                numberOfCoins = (int) (change);
                returnedSum = numberOfCoins;
                break;
            case "Quarter":
            case "Dime":
            case "Nickel":
            case "Penny":
                numberOfCoins = (int) (change / coinType.getValue());
                returnedSum += coinType.getValue() * numberOfCoins;
                break;
        }

        return numberOfCoins;
    }
}

