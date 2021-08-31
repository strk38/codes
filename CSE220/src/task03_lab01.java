    import java.util.Scanner;

    public class task03_lab01 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter length of Array :");
            int a = keyboard.nextInt();
            int arr[] = new int[a];
            for (int i = 0; i < a; i++) {
                System.out.println("Enter the values :");
                arr[i] = keyboard.nextInt();
            }
            int temp;
            for (int i = 0; i<a; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
                for(int i=0;i<a;i++) {
                    System.out.print(arr[i]+" ");
                }
            for(int i=0;i<a;i++) {
                if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
            }
            }


    }


