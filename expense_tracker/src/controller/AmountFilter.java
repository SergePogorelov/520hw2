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
     * @param maxAmount The maximum amount for filtering. Use 0 to indicate no maximum amount.
     */
    public AmountFilter(double minAmount, double maxAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    /**
     * Filters a list of transactions to include only those with amounts within the specified range.
     *
     * @param transactions The list of transactions to be filtered.
     * @return A filtered list of transactions with amounts greater than or equal to minAmount
     *         and, if specified, less than or equal to maxAmount (inclusive).
     */
    @Override
    public List<Transaction> filter(List<Transaction> transactions) {
        List<Transaction> filteredTransactions = new ArrayList<>();

        for (Transaction transaction : transactions) {
            double amount = transaction.getAmount();
            if (amount >= minAmount) {
                if (maxAmount == 0 || amount <= maxAmount) {
                    filteredTransactions.add(transaction);
                }
            }
        }

        return filteredTransactions;
    }
}
