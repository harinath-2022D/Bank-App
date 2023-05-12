import java.util.UUID;

public class HDFCBank implements BankAccount{
    private int balance;
    private String AccountNumber;
    private int ROI;
    public HDFCBank(int balance){
        this.balance = balance;
        this.ROI = 6;
        this.AccountNumber = String.valueOf(UUID.randomUUID());
    }

    public HDFCBank(int balance, int roi){
        this.balance = balance;
        this.ROI = roi;
        this.AccountNumber = String.valueOf(UUID.randomUUID());
    }
    public String getAccountNumber(){
        return this.AccountNumber;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setROI(int ROI) {
        this.ROI = ROI;
    }

    @Override
    public boolean withdrawCash(int cash){
        if(this.balance - cash >= 0){
            this.balance -= cash;
            return true;
        }
        return false;
    }

    @Override
    public boolean depositCash(int cash) {
        this.balance += cash;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.ROI;
    }
}
