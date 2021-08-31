public class Minus{

    
    public boolean Contain(int []C,int lenC,int item){
         for(int i=0;i<lenC;i++) {
             if (C[i] == item)
                 return true;
         }
         return false;
    }
     
    public int[] minus(int A[],int B[]){
        int idx=0;
        int C[]=new int[A.length];
        for(int i=0;i<A.length;i++){
                if(!Contain(B,B.length,A[i])){
                    C[idx]=A[i];
                    idx++;
                }
            }
        int []V=new int[idx];
         for(int i=0;i<idx;i++){
             V[i]=C[i];
         }
         C=V;
         for(int i=0;i<C.length;i++){
            if(C[i]==-1)
                break;
            System.out.print(C[i]+" ");
        }
        System.out.println();
        return C;
    }
    public static void print(int S[]){
        for(int i=0;i<S.length;i++){
            if(S[i]==-1)
                break;
            System.out.print(S[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
    Minus m=new Minus();
    int A[]={1,2,3,4,5,7};
    int B[]={2,4,6,8};
    
    int C[]=m.minus(A,B);
    //print(C);
    }
 
}