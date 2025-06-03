package tugas2_233040125;

public class BankAccount {
    private final String accountNumber; 
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil. Saldo baru: " + balance);
        }
    }

    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: Rp" + balance);
    }
}
