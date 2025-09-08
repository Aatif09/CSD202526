package Exception;

// Step 1: Create a user-defined exception
class InsufficientBalanceException extends Exception
{
    // Constructor with custom message
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}

// Step 2: Use the custom exception in application
class BankAccount
{
    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    // Withdraw method which may throw the user-defined exception
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount > balance)
        {
            throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance!");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class MainApp
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(5000);

        try
        {
            account.withdraw(6000); // Trying to withdraw more than balance
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try
        {
            account.withdraw(3000); // Valid withdrawal
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
