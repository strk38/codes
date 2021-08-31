import java.util.Scanner;

public class Task3 {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String w = keyboard.next();
        for(int i=0;i<w.length();i++){
        char ch=w.charAt(i);
       int codeForCh=(int)ch;
            //int codeForCh = w.codePointAt(0);
          //  System.out.println(codeForCh);

            System.out.println(ch+":"+codeForCh);
        }
    }
}
