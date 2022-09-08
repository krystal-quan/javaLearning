public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String firstInput = "DEPOSIT";
    public static final String secInput = "WITHDRAW";
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    /**
     * Get operation.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Get amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Get balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Set operation.
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Set amount.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Set balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
}