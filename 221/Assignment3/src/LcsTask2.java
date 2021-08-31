import java.util.*;
public class LcsTask2 {
    public static char[] lcs( char[] X, char[] Y, int m, int n ){

        int L[][] = new int[m+1][n+1];
        char[] val=new char[m];
        int b=0,p=0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==0){
                    L[i][j] = 0;

                }
                else if(X[i-1] == Y[j-1]){

                    L[i][j]=L[i-1][j-1]+1;//diagonal
                    if(b<L[i][j]) {
                        b = L[i][j];
                        //
                        val[p]=X[i - 1];
                        p++;

                    }
                }
                else{
                    L[i][j] = max(L[i-1][j], L[i][j-1]);

                }
            }
        }
        char[]ch=new char[p];
        for(int i=0;i<p;i++){
            ch[i]=val[i];
        }
        System.out.println(p);
        return ch;
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
        char ch[]=new char[10];
        ch[0]='M';
        ch[1]='W';
        ch[2]='C';
        ch[3]='A';
        ch[4]='D';
        ch[5]='B';
        ch[6]='O';
        ch[7]='E';
        ch[8]='R';
        ch[9]='P';

        String[]c={"monkeys","wearing","coats","are","doctors","because","of","evolution","results","eruption"};

        LcsTask1 lcs = new LcsTask1();

        String s1 = "M W C A D B O E";
        String s2 = "D M W C A R O P";



        char[] Y=s1.replaceAll(" ","").toCharArray();//given
        char[] X=s2.replaceAll(" ","").toCharArray();//played
        int m = X.length;
        int n = Y.length;//length of given string


        char[] q=lcs(X, Y, m, n);
        int[]index =new int[5];
        for(int i=0;i<q.length;i++){
            for(int j=0;j<ch.length;j++){
                if(q[i]==ch[j]) {
                   index[i]=j ;
                }
            }
        }

        for(int i=0;i<index.length;i++){
            System.out.print(c[index[i]]+" ");
        }
    }
}
