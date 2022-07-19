package com.jap.customexception;

public class Account {

    private double accountBalance;

    public Account() {
    }

    public Account(double accountBalance)
    {
        this.accountBalance=accountBalance;

    }

    public double getAccountBalance() {
        return accountBalance;
    }

    double result = 0;

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     * @throws InsufficientFundException

     */
    public double withdraw(double amount) throws InsufficientFundException {

        if (accountBalance<amount)
        {
            throw new InsufficientFundException("Insufficient balance in the account.");
        }
        else
        {
            result = accountBalance-amount;
        }

        return result; 
    }

}
