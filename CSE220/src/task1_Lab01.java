    import java.util.Scanner;
    public class task1_Lab01 {
        public static void main(String[] args) {
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Enter length of Array :");
            int a=keyboard.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                System.out.println("Enter the values :");
                arr[i]=keyboard.nextInt();
            }
            System.out.println("Enter the value to check it's position :");
            int b=keyboard.nextInt();
            if( arr[0]==b){
                System.out.print("TRUE .");
                System.out.println(" it is in first ");
            }
            else if( arr[a-1]==b){
                System.out.print("TRUE .");
                System.out.println(" it is in last.");
            }
            else{
                    System.out.println("FALSE .");
                }

        }
    }
