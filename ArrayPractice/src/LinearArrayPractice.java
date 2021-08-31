public class LinearArrayPractice {
    public static void main(String[] args) {
        int []a={10,20,35,40};

        System.out.println("Rotate");
        rotate(a,2);
        printArray(a);

        System.out.println("insert");
        sortedInsert(a,50);
        printArray(a);
        sortedInsert(a,0);
        printArray(a);
        sortedInsert(a,40);
        printArray(a);

        System.out.println("delete");
        delete(a,2);
        printArray(a);

        System.out.println("Polynomial");
        polynomial(a,2);

        maximum(a,1,3);
    }



    public static int[] rotate(int A[],int n) {
        for (int i = 0, j = A.length - 1; i < n || j>0; i++, j--) {
            A[j ] = A[j-1];

        }A[0]=0;
        return A;
    }

    public static void printArray(int source[]){
        for(int i=0;i<source.length;i++){
            System.out.print(source[i]+" ");
        }
        System.out.println();
    }

    public static int[]sortedInsert(int A[],int m){
        int size=A.length;
        int []b=new int[size];
        int index=0;
        if(A.length==b.length){
            System.out.println("There is no space");
             //resize(size+2);
            int Arr[]=new int[size+2];
            for(int i=0;i<b.length;i++){
                Arr[i]=b[i];
            }
            b=Arr;
        }
        else {
            for (int i = 0; i < b.length; i++) {
                if (b[i] > m) {
                    index = i;
                }
                else if(m>b[i]){
                    index=i;
                }
            }
            if(b[index]>m) {
                for (int j = b.length - 1; j > index; j--) {
                    b[j] = b[j - 1];
                    b[index] = m;
                }
            }
            if(m>b[index])
                 b[index+1]=m;
            }

         A=b;
        return A;
    }

    public static int[] delete(int[]A,int m){
        for(int i=0;i<A.length;i++){
            if(A[i]%m==0)
                A[i] = 0;

        }return A;
    }

    public static void polynomial(int []A,int x){
        int s=A.length;
        int value=0;
        for(int i=0;i<s;i++){
            value+=A[i]*Math.pow(x,i);
        }
        System.out.println("value: "+value);
    }

    public static void maximum(int []A,int L,int R){
        int index=0;
        for(int i=L;i<=R;i++){
            for(int j=L;j<i;j++) {
                if (A[i] > A[j]){
                    index=i;
                }
                else if(A[j]>A[i]){
                    index=j;
                }

            }
        }
        System.out.println("Max: "+A[index]);
    }

}
