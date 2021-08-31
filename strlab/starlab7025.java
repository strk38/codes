import java.util.Scanner;
public class starlab7025 {public static void main(String[]args){
    Scanner keyboard=new Scanner(System.in);
    System.out.print("Enter the height :");
    int height=keyboard.nextInt();
    for(int lineCount=1;lineCount<=height;lineCount++) {
        for (int spaceCount = height - lineCount; spaceCount > 0; spaceCount--) {
            System.out.print(" ");
        }
        for (int i = 1; i <= lineCount; i++) {
            System.out.print(i);
            if(lineCount>1 && i==lineCount){
                for( int k=lineCount-1; k>0;k--){
                System.out.print(k);
                }
            }
        }
        System.out.println();
    }
}
}
