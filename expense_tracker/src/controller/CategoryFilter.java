package controller;

import model.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 * The CategoryFilter class is an implementation of the TransactionFilter interface
 * that filters a list of transactions based on a specified category.
 */
public class CategoryFilter implements TransactionFilter {
    private String category;

    /**
     * Creates a new CategoryFilter with the specified category for filtering.
     *
     * @param category The category used for filtering transactions. Use an empty string to include all categories.
     */
    public CategoryFilter(String category) {
        this.category = category;
    }

    /**
     * Filters a list of transactions to include only those with the specified category.
     *
     * @param transactions The list of transactions to be filtered.
     * @return A filtered list of transactions with the specified category, or all transactions if the category is empty.
     */
    @Override
    public List<Transaction> filter(List<Transaction> transactions) {
        List<Transaction> filteredTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (category.isBlank() || transaction.getCategory().equalsIgnoreCase(category)) {
                filteredTransactions.add(transaction);
            }
        }
        return filteredTransactions;
    }
}
