//19101529
class thread00 extends Thread{
    private int[] array;
    private int left;
    private int right;

    public thread00(int[] arr, int i, int j) {
        this.array = arr;
        this.left  = i;
        this.right = j;
    }
    public void run(){
        sort(array,left, right);
    }

    public void sort(int arr[], int left, int right)
    {
        if (left < right) {

            int middle =left+ (right-left)/2;


            thread01 t_one= new thread01();
            t_one.sort(arr, left, middle);
            try{
                t_one.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Exiting thread1");
            thread02 t_two= new thread02();
            t_two.sort(arr, middle + 1, right);
            try{
                t_two.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Exiting thread2");

            merge(arr, left, middle, right);
            System.out.println("After merging from t00 : ");
            printArray(arr);
        }
    }

    public void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];




        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

class thread01 extends Thread{

    public void run(){
        //sort();
    }

    public void sort(int arr[], int left, int right)
    {
        if (left < right) {

            int middle =left+ (right-left)/2;

            // Sorting first and second halves
            //call 3t

            thread03 t_Three= new thread03();
            t_Three.sort(arr, left, middle);
            /*try{
                t_Three.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
            System.out.println("Exiting thread3");
            //calling 4th
            thread04 t_Four= new thread04();
            t_Four.sort(arr, middle + 1, right);
            /*try{
                t_Four.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
            System.out.println("Exiting thread4");
            //sort(arr, middle + 1, right);

            // Mergeing the sorted halves
            merge(arr, left, middle, right);
            System.out.println("After merging from t_one : ");
            printArray(arr);
        }
    }

    public void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

class thread02 extends Thread{

    public void run(){
        //sort();
    }

    public void sort(int arr[], int left, int right)
    {
        if (left < right) {

            int middle =left+ (right-left)/2;


            //calling 3t
            thread03 t_Three= new thread03();
            t_Three.sort(arr, left, middle);
            /*try{
                t_Three.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
            System.out.println("Exiting thread3");
            //call 4t
            thread04 t_Four= new thread04();
            t_Four.sort(arr, middle + 1, right);
            /*try{
                t_Four.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
            System.out.println("Exiting thread4");
            //sort(arr, middle + 1, right);


            merge(arr, left, middle, right);
            System.out.println("After merging from t_two : ");
            printArray(arr);
        }
    }

    public void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

class thread03 extends Thread{

    public void run(){
        //sort();
    }

    public void sort(int arr[], int left, int right)
    {
        if (left < right) {

            int middle =left+ (right-left)/2;




            sort(arr, left, middle);

            sort(arr, middle + 1, right);


            merge(arr, left, middle, right);
            System.out.println("After merging from t_Three : ");
            printArray(arr);
        }
    }

    public void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

class thread04 extends Thread{

    public void run(){
        //sort();
    }

    public void sort(int arr[], int left, int right)
    {
        if (left < right) {

            int middle =left+ (right-left)/2;




            sort(arr, left, middle);

            sort(arr, middle + 1, right);


            merge(arr, left, middle, right);
            System.out.println("After merging from t_Four : ");
            printArray(arr);
        }
    }

    public void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;


        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];




        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
public class Task3 {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 9, 6,15,7 };

        thread00 to= new thread00(arr,0,arr.length-1);
        to.start();
        try{
            to.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final Val: ");
        to.printArray(arr);
    }
}
