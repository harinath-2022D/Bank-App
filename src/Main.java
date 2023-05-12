public class Main {
    public static void main(String[] args) {
        HDFCBank test = new HDFCBank(1000);
        System.out.println(test.getAccountNumber());
        System.out.println(test.depositCash(1000));
        System.out.println(test.checkBalance());
        System.out.println(test.withdrawCash(2000));
        System.out.println(test.getROI());
        test.depositCash(100);
        System.out.println(test.checkBalance());
    }
}