import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str1 = keyboard.next();

        System.out.println("Enter another string :");
        String str2 = keyboard.next();

        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
