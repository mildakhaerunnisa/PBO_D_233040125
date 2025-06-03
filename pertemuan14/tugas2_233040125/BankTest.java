package tugas2_233040125;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("199725088", 8000000);
        SavingsAccount acc2 = new SavingsAccount("19938765", 5000000, 0.5);

        acc1.deposit(1000000);
        acc1.displayAccountInfo();

        acc2.deposit(500000);
        acc2.displaySavingsAccountInfo(); 
    }
}
