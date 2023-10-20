# hw1- Manual Review

The homework will be based on this project named "Expense Tracker",where users will be able to add/remove daily transaction. 

## Compile

To compile the code from terminal, use the following command:
```
cd src
javac ExpenseTrackerApp.java
java ExpenseTracker
```

You should be able to view the GUI of the project upon successful compilation. 

## Java Version
This code is compiled with ```openjdk 17.0.7 2023-04-18```. Please update your JDK accordingly if you face any incompatibility issue.

# Expense Tracker Application

The Expense Tracker is a Java-based application that allows users to manage their personal finances by tracking income and expenses. It provides an easy way to add, view, and analyze financial transactions.

## Features

### 1. Encapsulation and Immutability

The Expense Tracker application adheres to best practices for encapsulation and immutability. Here are the key points related to these principles:

- **Encapsulation**: The list of transactions is encapsulated within the application. This ensures that the internal data structure is protected, and external access is provided through getter methods.

- **Immutability**: When the getter method for the list of transactions is invoked, the returned data is immutable. This prevents external modifications to the internal data.

- **Information Hiding**: To make the `Transaction` class immutable, changes have been applied to prevent external data modification and ensure information hiding for the declared fields. Some methods that could modify the class have been removed to maintain immutability.


### 2. Filter Feature by Attribute Type (Amount and Category)

The Expense Tracker application now includes a robust filtering system to allow users to filter their transactions based on specific attributes, such as amount and category. Here's how the filtering feature works:

- **Filter by Amount**: Users can filter transactions by specifying a minimum and maximum amount. This is a flexible way to view transactions within a particular financial range.

- **Filter by Category**: Users can filter transactions by specifying a category. This helps users categorize and manage their expenses effectively.

- **Highlight Filtered Transactions**: The application highlights filtered transactions in green (RGB code: [173, 255, 168]) in the transaction table, making it easy to identify them.

- **Reset Filters**: To clear the highlighting of filtered entries, click the "Reset Filter" button. Clicking this button will remove the highlighting from any filtered rows, and the transaction table will display all transactions in white.

- **Input Validation**: The input validation developed for amount and category fields is applied to the filters as well to ensure that users enter valid filter criteria.

### 3. Undo Functionality

In line with good UI design principles, the Expense Tracker application now includes an "Undo" functionality to allow users to reverse certain actions, particularly the removal of transactions. The undo functionality design adheres to the MVC architecture pattern and is designed but not yet implemented.

**How the Undo Functionality Works**:

- Users can select any transaction row they wish to undo by either selecting the row directly in the table or specifying a row index in a UI widget.
- When the user triggers the "Undo" action, the application will restore the selected transaction to its previous state, reflecting the removal in the "Total Cost."

The implementation of this undo functionality is planned for a future update of the Expense Tracker application. Detailed information on the actual implementation will be provided in subsequent releases.