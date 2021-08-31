import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        StringAlly ally=new StringAlly();

        System.out.println("Enter first String :");
        String s1=keyboard.next();
        char[]first=s1.toCharArray();

        System.out.println("Enter second String :");
        String s2=keyboard.next();
        char[]second=s2.toCharArray();

        System.out.println("Using Built-in :"+s1.endsWith(s2));
        System.out.println("Is Suffix :"+ally.EndsWith(first,second));
    }
}
