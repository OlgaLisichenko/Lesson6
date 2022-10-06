public class CreditCard {

    private int accountNumber;
    private double currentAmount;

    public CreditCard() {}

    public CreditCard(int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void addAmount(double addedAmount) {
        this.currentAmount += addedAmount;
    }

    public void takeAmount(double amountWithdrawn) {
        this.currentAmount -= amountWithdrawn;
    }

    public String showCardInformation() {
        return "\nAccount number: " + accountNumber + " Current amount: " + currentAmount;
    }
}
