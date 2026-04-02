// 11. ATM Withdrawal System
import java.util.*;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                throw new Exception();
            }
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println("Insufficient Balance");
        }
    }
}