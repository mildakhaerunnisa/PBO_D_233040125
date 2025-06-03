package tugas2_233040125;

class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }
    	//     Mencoba meng-override method final
//    @Override
//    public void displayAccountInfo() {
//        System.out.println("Nomor Rekening: " + accountNumber);
//        System.out.println("Saldo: Rp" + balance);
//        System.out.println("Suku Bunga: " + interestRate + "%");
//    }
    
    	// error yg dihasilkan
//    error: displayAccountInfo() in SavingsAccount cannot override displayAccountInfo() in BankAccount
//    @Override
//    ^
//    overridden method is final
    
    // menambahkan methode baru 
    public void displaySavingsAccountInfo() {
        super.displayAccountInfo(); // Memanggil method dari superclass
        System.out.println("Suku Bunga: " + interestRate + "%");
    }
}
