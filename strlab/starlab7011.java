import java.util.Scanner;

public class starlab7011 {
    public static void main(String[]args) {
    System.out.print("Enter height,H :");
    Scanner keyboard = new Scanner(System.in);
    int heightH= keyboard.nextInt();
    int numCount=1;
    for (int lineCount = 1; lineCount <= heightH ; lineCount++) {
        for (int spaceCount =  heightH-lineCount ;spaceCount >=1; spaceCount--) {
            System.out.print(" ");
        }
        for(int columnCount=heightH-lineCount +1;columnCount<=heightH;columnCount++){
            System.out.print(columnCount);
        }
        System.out.println();
        }


    }
}
