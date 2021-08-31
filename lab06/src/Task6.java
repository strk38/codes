import java .util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter amount of number :");
        int x=keyboard.nextInt();
        int a[]=new int[x];
        System.out.println("Enter the numbers :");
        int counter=0;

        for(int i=0;i<a.length;i++){
            int b=keyboard.nextInt();
            a[i]=b;
            if(a[i]>0)
                counter++;
        }
        int newArray[]=new int[counter];
        int j=0;

        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                newArray[j]=a[i];
                j++;
            }
        }
        System.out.println("Size of newArray :"+newArray.length);

        for(int i=0;i<newArray.length;i++)
            System.out.println(newArray[i]);
    }
}
