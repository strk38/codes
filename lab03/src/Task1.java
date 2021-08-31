import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner (System.in);
        System.out.println("Enter the word: ");
        String word=keyboard.next();
       int count=0;

       for(int i=0;i<word.length();i++){
           count++;
       }
        System.out.println(count);

    }
}
