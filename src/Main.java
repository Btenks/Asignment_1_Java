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

    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }
//Number 7 (cover)
    public void cover() {
        System.out.println("You are covered");
    }
}
public class Main {
//Number 8
    public static void main(String[] args) {
        Bank myBankAccount = new Bank("BTM", 230234);
    }
}