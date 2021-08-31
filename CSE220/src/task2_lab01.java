import java.util.Scanner;

public class task2_lab01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int a = keyboard.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter the values :");
            arr[i] = keyboard.nextInt();
        }
        int max=0,min=0;
        for (int i=0;i<a;i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
            int temp=arr[max];
            arr[max]=arr[min];
            arr[min]=temp;
        for(int i=0;i<a;i++) {
            System.out.println(arr[i]+" ");}
    }
}
