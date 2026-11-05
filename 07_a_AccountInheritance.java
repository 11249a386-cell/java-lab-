public class AccountInheritance {
    static class Account {
        int accountNumber, balance;
        Account(int accountNumber, int balance) {
            this.accountNumber=accountNumber; this.balance=balance;
        }
        void credit(int amount) { balance += amount; }
        void debit(int amount) { balance -= amount; }
        void displayBalance() { System.out.println("Balance = " + balance); }
    }
    static class SBAccount extends Account {
        double rate;
        SBAccount(int number, int balance, double rate) {
            super(number,balance); this.rate=rate;
        }
        void displayInterestRate() { System.out.println("Interest Rate = " + rate); }
    }
    public static void main(String[] args) {
        SBAccount obj = new SBAccount(1001,5000,6.5);
        obj.credit(2000); obj.debit(1000);
        obj.displayBalance(); obj.displayInterestRate();
    }
}
