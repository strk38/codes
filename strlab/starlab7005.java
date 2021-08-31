import java.util.Scanner;

public class starlab7005 {public static void main(String[]args) {
    System.out.print("Enter height,H :");
    Scanner keyboard = new Scanner(System.in);
    int heightH= keyboard.nextInt();
    for(int lineCount=1;lineCount<=heightH;lineCount++)
    {
        for(int starCount=1;starCount<=lineCount;starCount++){
        System.out.print("*");

    }
        System.out.println(); }

}}
