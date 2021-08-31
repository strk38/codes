import java.util.Scanner;
public class Io{
  public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int[] statistics=new int[5];
int i, n;
System.out.println("enter total eight numbers between 2 and 4 only, otherwise I will have to make my array larger.");
for(i=0;i<=7;++i){
n=sc.nextInt();
statistics[n]=statistics[n]+1;
}
for(i=2;i<=4;++i){
System.out.println(i+" was found "+ statistics[i]+ " times");        
}
}
}