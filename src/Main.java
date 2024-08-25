//Number 1
class Bank {
    private String accountType;
    private double accountBalance;
//Number 4
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
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
// Number 5
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}
//Number 6
class Insurance extends Bank {


}
public class Main {

}