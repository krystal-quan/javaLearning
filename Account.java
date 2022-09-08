import java.util.ArrayList;

public class Account{
    private double balance;
    ArrayList<String> history = new ArrayList<String>();
    /**
     * Deposit one.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * Withdraw one.
     */
    private void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        }
    }

    /**
     * Add transaction function.
     */
    public void addTransaction(double amount, String operation) {
        if (operation != )
    }
}