import java.util.Scanner;

public class starlab7002 {
    public static void main(String[] args) {
        System.out.print("Enter num,n :");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int i;
        for(i=1;i<=n;i++){
            System.out.print("*");
        }
    }
}