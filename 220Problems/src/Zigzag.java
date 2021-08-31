public class Zigzag {
    public static void main(String[] args) {
        Zigzag Z_Z=new  Zigzag();
        int A[]={1,3,5,7};
        int B[]={2,4,6,8};
        System.out.println("Zig-zag union :");
        int C[]= Z_Z.Union(A,B);
        printArray(C);

    }

    public  int[] Union(int []x,int []y){
        int len=x.length+y.length;
        int []C=new int[len];
        for(int i=0,j=0;i<len;i=i+2,j++){
            C[i]=x[j];
        }
        for(int i=1,j=0;i<len;i=i+2,j++){
            C[i]=y[j];
        }
        return C;
    }

    public static void printArray(int s[]){
        for(int i=0;i<s.length;i++){
            if(s[i]==-1)
                break;
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
