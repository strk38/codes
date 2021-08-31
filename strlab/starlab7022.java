import java.util.Scanner;

public class starlab7022 {public static void main(String[]args) {
    System.out.print("Enter line,L :");
    Scanner keyboard = new Scanner(System.in);
    int lineQuantity = keyboard.nextInt();
    for (int lineCount = 1; lineCount <= lineQuantity; lineCount++) {
        for (int spaceCount = lineQuantity-lineCount ;spaceCount >=1; spaceCount--) {
            System.out.print(" ");
        }
        for (int columnCount = 1; columnCount<= 2*lineCount-1; columnCount++) {
            if (lineCount == 1 || columnCount ==1|| columnCount == 2 * lineCount - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
    for (int lineCount = lineQuantity-1; lineCount >=1; lineCount--) {
        for (int spaceCount = lineQuantity-lineCount ;spaceCount >=1; spaceCount--) {
            System.out.print(" ");
        }
        for (int columnCount = 1; columnCount<= 2*lineCount-1; columnCount++) {
            if (lineCount == 1 || columnCount ==1|| columnCount == 2 * lineCount - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
}
