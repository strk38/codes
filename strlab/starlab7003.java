import java.util.Scanner;

public class starlab7003 {
    public static void main(String[]args) {
        System.out.print("Enter num,n :");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.print("Enter line,k :");
        int k = keyboard.nextInt();
        int i,j;
        for(j=1;j<=k;j++){for(i=1;i<=n;i++){
            System.out.print("*");
        }
            System.out.println(); }
    }

}
