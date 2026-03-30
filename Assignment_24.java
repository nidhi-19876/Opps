// 4. Create a class MessageFormatter.
import java.util.*;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String last = sc.nextLine();
        String full = first + " " + last;
        System.out.println(full);
    }
}