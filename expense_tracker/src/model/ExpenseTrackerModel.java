package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Stack;

public class ExpenseTrackerModel {

  // private Stack<List<Transaction>> transactionHistory = new Stack<>();
  private List<Transaction> transactions;

  public ExpenseTrackerModel() {
    transactions = new ArrayList<>(); 
  }

  public void addTransaction(Transaction t) {
    transactions.add(t);
  }

  public void removeTransaction(Transaction transaction) {
      // Capture the current state and push it to the history stack
      // transactionHistory.push(new ArrayList<>(transactions));

      // Remove the transaction
      transactions.remove(transaction);
  }

//   public void undoLastAction() {
//       if (!transactionHistory.isEmpty()) {
//           // Restore the previous state
//           transactions = transactionHistory.pop();
//       }
// }

  public List<Transaction> getTransactions() {
    return Collections.unmodifiableList(transactions);
  }
  

}