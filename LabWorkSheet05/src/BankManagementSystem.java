public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(800);
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
