public interface BankAccount {
    boolean withdrawCash(int cash);
    boolean depositCash(int cash);
    int checkBalance();
    int getROI();
}
