//Number 1
class Bank {
    private String accountType;
    private double accountBalance;

// Number 2
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }
// Number 3
    public double withdrawal(double amount) {
        if (amount <= accountBalance) {
        accountBalance -= amount;
        } else {
        System.out.println("Insufficient balance.");
        }
    return accountBalance;
    }
}
public class Main {

}