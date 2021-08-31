    import java.util.Scanner;

    public class task5_lab01 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter length of Array :");
            int a = keyboard.nextInt();
            int arr[] = new int[a];
            int b;
            for (int i = 0; i < a; i++) {
                System.out.println("Enter the values :");
                b=keyboard.nextInt();
                if (b > 9||b<0) {
                    i--;
                    System.out.println("Enter another new  number between 0-9 .");
                }else
                arr[b]++;
            }
                for (int i = 0; i <a; i++) {
                    System.out.println(i+" was found "+arr[i]+" times");
                }
        }

    }

