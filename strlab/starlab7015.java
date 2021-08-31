import java.util.Scanner;

public class starlab7015 {public static void main(String[]args) {
    System.out.print("Enter length :");
    Scanner keyboard = new Scanner(System.in);
    int length = keyboard.nextInt();
    System.out.print("Enter width :");
    int width = keyboard.nextInt();
    for(int lineCount=1; lineCount<=length; lineCount++){
        for(int columnCount=1;columnCount<=width;columnCount++){
            if(lineCount==1 || lineCount==length || columnCount==1 || columnCount==width) {
                System.out.print(columnCount);
            }

            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
 }
}
