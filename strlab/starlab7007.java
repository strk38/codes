import java.util.Scanner;

public class starlab7007 {public static void main(String[]args) {
    System.out.print("Enter height,H :");
    Scanner keyboard = new Scanner(System.in);
    int heightCount = keyboard.nextInt();
    for (int lineCount = 1; lineCount<=heightCount ; lineCount++) {
        for (int spaceCount = heightCount-lineCount ;spaceCount >=1; spaceCount --) {
            System.out.print(" ");
        }
        for (int starCount = 1;starCount <= lineCount; starCount++) {
            System.out.print("*");

        }


        System.out.println();
    }
}
}

