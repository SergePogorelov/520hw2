package controller;

import model.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 * The AmountFilter class is an implementation of the TransactionFilter interface
 * that filters a list of transactions based on a specified range of amounts.
 */
public class AmountFilter implements TransactionFilter {
    private double minAmount;
    private double maxAmount;

    /**
     * Creates a new AmountFilter with the specified minimum and maximum amount values.
     *
     * @param minAmount The minimum amount for filtering.
     * @param maxAmount The maximum amount for filtering.
     */
    public AmountFilter(double minAmount, double maxAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    /**
     * Filters a list of transactions to include only those with amounts within the specified range.
     *
     * @param transactions The list of transactions to be filtered.
     * @return A filtered list of transactions with amounts between minAmount and maxAmount (inclusive).
     */
    @Override
    public List<Transaction> filter(List<Transaction> transactions) {
        List<Transaction> filteredTransactions = new ArrayList<>();

        for (Transaction transaction : transactions) {
            double amount = transaction.getAmount();
            if (amount >= minAmount && amount <= maxAmount) {
                filteredTransactions.add(transaction);
            }
        }

        return filteredTransactions;
    }
}
