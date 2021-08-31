import java.util.Scanner;

public class starlab7008 {public static void main(String[]args) {
    System.out.print("Enter height,H :");
    Scanner keyboard = new Scanner(System.in);
    int height = keyboard.nextInt();
    for (int lineCount = 1; lineCount<= height; lineCount++) {
        for (int spaceCount = height-lineCount ;spaceCount>=1; spaceCount--) {
            System.out.print(" ");
        }
        for (int columnCount = 1; columnCount <= lineCount; columnCount++) {
            System.out.print(columnCount);

        }


        System.out.println();
    }
}
}
