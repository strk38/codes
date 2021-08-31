//Ariful Islam
//17101314
//Task03
import java.util.Scanner;
public class Task03 extends Thread {
    
private int[] array;
private int left;
private int right;
private int[] resultArray;

public Task03(int[] arr, int i, int j) {
    this.array = arr;
    this.left  = i;
    this.right = j;
}

@Override
public void run() {
    
    sort();
}

private void sort() {

    if(left==right && left >=0 ){
         this.resultArray = new int[]{array[left]};
         return;
    }
    if(left>right) 
    return;
    int rightPart = this.left+(right-left)/2;

    Task03 mergeLeft = new Task03(array,left,rightPart);
    Thread thread01 = new Thread(mergeLeft);
    thread01.start();
    int leftPart = 1 + rightPart;            
    

     Task03 mergeRight= new Task03(array,leftPart,right);
     Thread thread02 = new Thread(mergeRight);
      thread02.start();


       try {
        thread01.join();
        thread02.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

      merge(mergeLeft.resultArray,mergeRight.resultArray);
}

private  int[] merge(int[] left, int[] right) {
     resultArray = new int[left.length+right.length];

    int r=0;
    int i=0;
    int j=0;
    while(i<left.length && j <right.length ){   
        if( i<left.length && j<right.length && left[i] < right[j] )
            resultArray[r++] = left[i++];
        else if( j<right.length && i<left.length && right[j] < left[i])
            resultArray[r++] = right[j++];
    }   


    while(i<left.length){
        resultArray[r++] = left[i++];
    }        

    while(j<right.length){
        resultArray[r++] = right[j++];
    }        
    return resultArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter numbers to sort: ");
            input[i] = sc.nextInt();
        }

        Task03 obj = new Task03(input, 0, input.length - 1);

        Thread t = new Thread(obj);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Array ==> ");

        for (int i : obj.resultArray){
            System.out.print(i + " ");
        }

    }

 }

