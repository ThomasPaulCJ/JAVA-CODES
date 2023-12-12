import java.util.*;
class InvalidAmountException extends Exception
{
        public InvalidAmountException(String message)
        {
                super(message);
        }
}
class InsufficientFundsException extends Exception
{
        public InsufficientFundsException(String message)
        {
                super(message);
        }
}
class BankAccount
{
        private int accountNumber;
        private String customerName;
        private double balance;
        public BankAccount(int accountNumber, String customerName, double balance)
        {
                this.accountNumber = accountNumber;
                this.customerName = customerName;
                this.balance = balance;
        }
        public int getAccountNumber()
        {
                return accountNumber;
        } 
        public String getCustomerName()
        {
                return customerName;
        }
        public double getBalance()
        {
                return balance;
        }
        public void deposit(double amount) throws InvalidAmountException
        {
                if (amount <= 0)
                {
                        throw new InvalidAmountException("Deposit amount should be greater 	than 0");
                }
                balance += amount;
                System.out.println("Deposit successful. Updated balance: " + balance);
        }
        public void withdraw(double amount) throws InvalidAmountException, 	InsufficientFundsException
        {
                if (amount <= 0)
                {
                        throw new InvalidAmountException("Withdrawal amount should be 	greater than 0");
                }
                if (amount > balance)
                {
                        throw new InsufficientFundsException("Insufficient funds. Cannot 	withdraw.");
                }	
                balance -= amount;
                System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
        public void displayAccountDetails()
        {
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Customer Name: " + customerName);
                System.out.println("Balance: " + balance);
        }
}
public class Custom_Exception
{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of customers: ");
                int numCustomers = sc.nextInt();
                BankAccount[] accounts = new BankAccount[numCustomers];
                for (int i = 0; i < numCustomers; i++)
                {
                        System.out.println("\nEnter details for Customer " + (i + 1) + ":");
                        System.out.print("Enter account number: ");
                        int accNum = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter customer name: ");
                        String custName = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double balance = sc.nextDouble();
                        accounts[i] = new BankAccount(accNum, custName, balance);
                }
                int choice;
                System.out.println("\nMenu:");
                System.out.println("1. Display all account details");
                System.out.println("2. Search by account number");
                System.out.println("3. Deposit amount");
                System.out.println("4. Withdraw amount");
                System.out.println("5. Exit");
                do {
                        System.out.print("Enter your choice: ");
                        choice = sc.nextInt();
                        switch (choice)
                        {
                                case 1:
                                        System.out.println("\nAll Account Details:");
                                        for (BankAccount account : accounts)
                                        { 
                                                account.displayAccountDetails();
                                                System.out.println("--------------------");
                                        }
                                        break;
                                case 2:
                                        System.out.print("\nEnter account number to search: ");
                                        int searchAccNum = sc.nextInt();
                                        boolean found = false;
                                        for (BankAccount account : accounts)
                                        {
                                                if (account.getAccountNumber() == searchAccNum)
                                                {
                                                        account.displayAccountDetails();
                                                        found = true;
                                                        break;
                                                }
                                        }
                                        if (!found)
                                        {
                                                 System.out.println("Account not found");
                                        }
                                        break;
                                case 3:
                                        System.out.print("\nEnter account number for deposit: ");
                                        int depositAccNum = sc.nextInt();
                                        System.out.print("Enter amount to deposit: ");
                                        double depositAmount = sc.nextDouble();
                                        for (BankAccount account : accounts)
                                        {
                                                if (account.getAccountNumber() == depositAccNum)
                                                {
                                                        try {
                                                                account.deposit(depositAmount); }
                                                        catch (InvalidAmountException e)
                                                        {
                                                                System.out.println("Error: " + 	e.getMessage());
                                                        }
                                                        break;
                                                }
                                        }
                                        break;
                                case 4:
                                        System.out.print("\nEnter account number for withdrawal: ");
                                        int withdrawAccNum = sc.nextInt();
                                        System.out.print("Enter amount to withdraw: ");
                                        double withdrawAmount = sc.nextDouble();
                                        for (BankAccount account : accounts)
                                        {
                                                if (account.getAccountNumber() == withdrawAccNum)
                                                {
                                                        try
                                                        {
                                                                account.withdraw(withdrawAmount);
                                                        }
                                                        catch (InvalidAmountException | InsufficientFundsException e)
                                                        {
                                                                System.out.println("Error: " + 	e.getMessage());
                                                        }
                                                        break;
                                                }
                                        }
                                        break;
                                case 5:
                                        System.out.println("Exited");
                                        break;
                                        default:
                                        System.out.println("Invalid choice. Please enter a valid option.");
                        }
                }
                while (choice != 5);
                sc.close();
                }
}
