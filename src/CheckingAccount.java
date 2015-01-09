/**
 * Created by MAXIMILLION on 12/15/14.
 */
public class CheckingAccount{
    private double myBalance;
    private int myAccountNumber;

    public CheckingAccount(){
        myBalance = 0.0;
        myAccountNumber = 0;
    }

    // Precondition: Account has not been created
    // Postcondition: Checking account holds a non-negative balance
    public CheckingAccount(double initialBalance, int acctNum){
        if (initialBalance < 0.0) {
            throw new IllegalArgumentException("Initial account balance cannot be negative.");
        }
        myBalance = initialBalance;
        myAccountNumber = acctNum;
    }

    // Precondition: Account holds a non-negative balance
    // Postcondition: Shows you the balance
    public double getBalance(){
        return myBalance;
    }

    // Precondition: Account holds a non-negative balance
    // Postcondition: Account balance is increased by deposit amount
    public void deposit(double amount){
        if (amount < 0.0) {
            throw new IllegalArgumentException("Cannot deposit negative amount.");
        }
        myBalance += amount;
    }

    // Precondition: Account holds a non-negative balance
    // Postcondition: Account balance is decreased by amount withdrawn, account balance is non-negative
    public void withdraw( double amount ){
        if (amount > getBalance()) {
            throw new IllegalArgumentException("Cannot withdraw more than the account balance holds.");
        }
        myBalance -= amount;
    }
}
