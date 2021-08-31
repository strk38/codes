    import java.util.Scanner;

    public class task4_lab01 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter length of Array :");
            int a = keyboard.nextInt();
            int arr[] = new int[a];
            for (int i = 0; i < a; i++) {
                System.out.println("Enter the values :");
                arr[i] = keyboard.nextInt();
                for(int j=0;j<i;j++){
                    if(arr[i]==arr[j]){
                        i--;
                        System.out.println("Enter another new  number .");
                    }
                }
            }
        }
    }
