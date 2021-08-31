import java.util.Scanner;
public class Task5 {
    public static void main(String[]args){
    Scanner keyboard=new Scanner(System.in);

        System.out.println("Enter a string :");
        String str=keyboard.next();
        char[]p=str.toCharArray();

        System.out.println("Enter old character :");
        String old=keyboard.next();
        char[]o=old.toCharArray();

        System.out.println("Enter new character :");
        String notun=keyboard.next();
        char[]n=notun.toCharArray();

        String replaceString=str.replace(old,notun);
        System.out.println("Replacing "+replaceString);


    }
}

