// 3. Define a class StudentNameComparison.
import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Case-sensitive: Equal");
        } else {
            System.out.println("Case-sensitive: Not Equal");
        }

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-insensitive: Equal");
        } else {
            System.out.println("Case-insensitive: Not Equal");
        }
    }
}