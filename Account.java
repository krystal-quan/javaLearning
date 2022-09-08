import java.util.ArrayList;

public class Account{
    private double balance;
    ArrayList<Transaction> history = new ArrayList<Transaction>();
    /**
     * Deposit one.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
          history.add("deposit", amount, balance + amount);
          balance += amount;
        }
    }

    /**
     * Withdraw one.
     */
    private void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
          history.add("withdraw", amount, balance - amount);
          balance -= amount;
        }
    }

    /**
     * Add transaction function.
     */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.firstInput && operation != Transaction.secInput) {
          System.out.println("Yeu cau khong hop le!");
        }
        else {
          if (opearation == "deposit") {
            deposit(amount);
          } else {
            withdraw(amount);
          }
        }
    }
}