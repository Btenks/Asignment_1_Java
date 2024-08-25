//Number 1 Creation of Bank class
class Bank {
    private final String accountType;
    private double accountBalance;
//Number 4 Creation of the bank class constructors
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
// Number 2 Creation of the deposit method
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }
// Number 3 Creation of the withdrawal method
    public double withdrawal(double amount) {
        if (amount <= accountBalance) {
        accountBalance -= amount;
        } else {
        System.out.println("Insufficient balance.");
        }
    return accountBalance;
    }
// Number 5 Creation of the display method
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}
//Number 6 Creation of insurance class that inherits from Bank
class Insurance extends Bank {

    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }
//Number 7 (cover) Creation of the cover method
    public void cover() {
        System.out.println("You are covered");
    }
}
public class Main {
//Number 8 Creation of the main class
    public static void main(String[] args) {
        Bank myBankAccount = new Bank("BTM", 230234);

//Number 9 Invocation of the display method
        myBankAccount.display();
    }
}