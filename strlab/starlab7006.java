import java.util.Scanner;

public class starlab7006 {public static void main(String[]args) {
    System.out.print("Enter height,H :");
    Scanner keyboard = new Scanner(System.in);
    int heightH= keyboard.nextInt();
    for(int lineCount=1; lineCount<= heightH; lineCount++)
    {
        for(int columnCount=1;columnCount<= lineCount;columnCount++){
            System.out.print(columnCount);

        }
        System.out.println(); }

}
}
