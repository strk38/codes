import java.util.*;
import java.lang.*;

public class LcsTask1 {
    public static int lcs( char[] X, char[] Y, int m, int n ){

        int L[][] = new int[m+1][n+1];
        //char[] val=new char();
        int b=0;
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0){
                    L[i][j] = 0;
                    //System.out.println(i+" "+L[i][j]+" "+j);
                }
                else if(X[i-1] == Y[j-1]){
                    //System.out.println(i+" "+X[i-1]+" "+Y[j-1]);
                    L[i][j]=L[i-1][j-1]+1;//diagonal
                    if(b<L[i][j]) {
                        b = L[i][j];
                        System.out.print(X[i - 1]+"");
                        //System.out.println(i + " " + L[i][j] + " " + j);
                    }
                }
                else{
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
                    //System.out.println(i+" "+L[i][j]+" "+j);
                }
            }
        }
        System.out.println();
        return L[m][n];
    }
    public static int Accuracy(int given,int lcs){
        return((lcs*100/given));
    }
    public static void check(double val){
        if(val>=50)
            System.out.println(val+"%"+" PASSED");
        else
            System.out.println(val+"%"+" FAILED");
    }

    public static int max(int a, int b) {
        int r=0;
        if(a>b)
            r=a;
        else
            r=b;
        return r;
    }

    public static void main(String[] args)
    {
        LcsTask1 lcs = new LcsTask1();

        String s1 = "C D E F G A B C";//given
        String s2 = "C E F D A B G A C";//played



        char[] Y=s1.replaceAll(" ","").toCharArray();//given
        char[] X=s2.replaceAll(" ","").toCharArray();//played
        int m = X.length;
        int n = Y.length;//length of given string
        //System.out.println(m+" "+n);
        int q=lcs(X, Y, m, n);
        int accu=Accuracy(n,q);
        check(accu);
    }
}
