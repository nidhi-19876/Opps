// 1. Create a class called UsernameValidator.
import java.util.*;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        username = username.trim();
        username = username.toLowerCase();
        System.out.println(username);
    }
}