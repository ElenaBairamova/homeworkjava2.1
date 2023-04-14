public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int addition = 1100;
        int account;

        if (addition > 1000) {
            account = balance + addition + addition / 100;
        } else {
           account = balance + addition;
        }
        System.out.println(account);
    }
}