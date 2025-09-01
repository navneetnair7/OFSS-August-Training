public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankobj = new BankAccount(101, "Tejas", 100, "HDFC Bank");
        bankobj.showBankAccount();
    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;
    public String bankName;

    public BankAccount(int accountNumber, String accountHolder, double accountBalance, String bankName) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.bankName = bankName;
    }

    public void showBankAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Bank Name: " + bankName);
    }

    // function overloading
    public void withdrawAmount(double amount) {
        accountBalance -= amount;
    }
    public void withdrawAmount(double amount, String day) {
        System.out.println("Withdrawing on " + day);
        accountBalance -= amount;
    }
    // can also have different arguments, same arguments but different order, same arguments but type is different, different number of arguments

    // operator overloading when going from left to right. left to right the type remains same when doing operations
}
