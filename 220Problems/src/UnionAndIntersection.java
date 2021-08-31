import java.util.Scanner;

 class UnionAndIntersection {
     public boolean Contain(int []C,int lenC,int item){
         for(int i=0;i<lenC;i++) {
             if (C[i] == item)
                 return true;
         }
         return false;
     }

     public int[]  UnionArray(int a[],int b[]) {

        int lenC=a.length+b.length;
        int C[]=new int[lenC];
        for(int i=0;i<lenC;i++)
            C[i]=-1;

        int idxC=0;
        for(int i=0;i<a.length;i++){
            if(!Contain(C,lenC,a[i])){  //value is !true ->false
                C[idxC]=a[i];
                idxC++;
            }
        }

       for(int i=0;i<b.length;i++){
           if(!Contain(C,lenC,b[i])){
               C[idxC]=b[i];
               idxC++;
           }
       }
       int temp;
       int count=0;
       for(int i=0;i<C.length;i++){
           if(C[i]==-1)
               break;
           count++;
       }
       //System.out.println(count);
       int []v=new int[count];
       for(int i=0;i<count;i++) {
           v[i]=C[i];
           if (C[i] == -1)
               break;
       }
       for(int i=0;i<count;i++){
           for(int j=0;j<i;j++){
               if(v[i]<v[j]){
                temp=v[j];
                v[j]=v[i];
                v[i]=temp;
               }
           }
       }C=v;


     return C;
    }

     public int [] IntersectArray(int []a,int[]b){
        int idx=0;
         int []C=new int[a.length];
         for(int i=0;i<a.length;i++) {
             if (Contain(b, b.length, a[i])) {
                 C[idx] = a[i];
                 idx++;
             }
         }
         int []V=new int[idx];
         for(int i=0;i<idx;i++){
             V[i]=C[i];
         }
         C=V;

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

     public static void main(String[] args) {
        UnionAndIntersection U_I=new UnionAndIntersection();
        int A[]={1,2,2,5,8};
        int B[]={1,3,4,6,8};
         System.out.println("Union bteween Arrays :");
         int C[]=U_I.UnionArray(A,B);
         //Arrays.sort(C);
         printArray(C);

         System.out.println("Intersect :");
         int D[]=U_I.IntersectArray(A,B);
         printArray(D);
     }
 }