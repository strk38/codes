import java.util.Scanner;
public class starlab7024 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the value :");
        int i=keyboard.nextInt();
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }for(int j=i-1;j>=1;j--){
            System.out.print(j);
        }
    }
}
