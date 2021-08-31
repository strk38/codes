import java.util.Scanner;

public class starlab7010 {public static void main(String[]args) {
    System.out.print("Enter line,L :");
    Scanner keyboard = new Scanner(System.in);
    int lineQuantity = keyboard.nextInt();
    for (int lineCount = 1; lineCount <= lineQuantity; lineCount++) {
        for (int spaceCount = lineQuantity-lineCount ;spaceCount >=1; spaceCount--) {
            System.out.print(" ");
        }
        for (int columnCount = 1; columnCount<= 2*lineCount-1; columnCount++) {
            System.out.print(columnCount);

        }


        System.out.println();
    }
}
}
