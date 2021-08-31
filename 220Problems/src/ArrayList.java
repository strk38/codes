import jdk.jfr.Frequency;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList A=new ArrayList();
        System.out.println();
    int []C={1,2,4,5};
        System.out.println();
        System.out.println("Insert after Sorted list");
    int X[]=A.SortedInsert(C,4,0);
    print(C);
    print(X);

        System.out.println();
        System.out.println("Frequency");
    int B[]={1,2,3,1,2,3,4,5,6,5,9};
    Frequency(B);

        System.out.println();
        System.out.println("Second Max of a list");
    int Y[]={10,20,30,10,30};
    SecondMax(Y);

        System.out.println();
        System.out.println("Median of a list");
    int M[]={1,2,5,4,9,8,6,7};
    Median(M);

        System.out.println();
        System.out.println("Median of a list");
    int N[]={1,2,5,4,9,8,7};
    Median(N);

        System.out.println();
        System.out.println("Merge two Sorted array : ");
     mergeSort(M,N);

    }

    public int[] SortedInsert(int A[],int n,int m){
        int a[]=new int[n+1];
        int temp=-1;
        for(int i=0;i<a.length-1;i++){
            a[i]=A[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]>m){
               // System.out.println(a[i]);
                temp=i;
                break;
            }
            else{
                temp=n;
            }
        }
        if(temp>-1 && temp<a.length){
        for(int i=a.length-1;i>temp;i--)
            a[i]=a[i-1];

        }
        a[temp]=m;
        A=a;
        return A;
    }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void Frequency(int A[]){
        int f[]=new int[A.length];
        int visit=-1;
        for(int i=0;i<A.length;i++){
            int count=1;
            for(int j=i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    count++;
                    f[j]=visit;
                }
            }
            if(f[i]!=visit)
                f[i]=count;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]!=visit){
                System.out.println("Frequency of "+A[i]+" is "+f[i]+" in "+i);
            }
        }
    }

    public static void SecondMax(int a[]){
        int c[]=new int[a.length];
        int secondMax=0,max=0;

        for(int i=0;i<a.length;i++){
                if(a[i]>max) {
                    secondMax=max;
                    max = a[i];

                }
                else if(a[i]==max || a[i]==secondMax){
                }
                else if(a[i]>secondMax){
                    secondMax=a[i];
                }
        }
        System.out.println("SecondMax : "+secondMax);
    }

    public static void sort(int A[]){
        int temp=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                   temp=A[i];
                   A[i]=A[j];
                   A[j]=temp;
                }
            }
        }
        print(A);
        /* for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println(); */
    }

    public static void Median(int a[]){
        int count=0;
        sort(a);
        for(int i=0;i<a.length;i++){
            count++;
        }
        if(count%2!=0){
            System.out.println("Median : "+a[(a.length-1)/2]);
        }
        else
            System.out.println("Even number of elements : ");
    }

    public static void mergeSort(int a[],int b[]){
        int count=0;
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            count++;
        }
        for(int i=count,j=0;i<c.length && j<b.length;i++,j++){
            c[i]=b[j];
        }
        sort(c);
        //print(c);
    }

}
