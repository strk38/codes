import java.util.Scanner;

public class Task4 {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String w = keyboard.next();
        int []a=new int[26];
        for(int i=0;i<w.length();i++) {
            char ch = w.charAt(i);
//            int codeForCh = (int)w.charAt(i); can be written instead of below.
           int codeForCh = (int)ch;
            a[ch-65]++;
        }
          for(int i=0;i<26;i++) {

              System.out.println((char)(i+65) + " which is " +(i+65)+ " was found " + a[i] + " times.");
          }
        }
}

