import java.util.Scanner;
public class Ibnul{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n+1;i++){
      
      for(int j=0;j<n-i;j++){
        System.out.print(" ");
      }
      
      System.out.print(i*i);
      for(int j=1;j<=i;j++){
        System.out.print(i-j);
      }
      for(int j=1;j<i;j++){
        System.out.print(j);
      }
      if(i!=0)
        System.out.print(i*i);
      System.out.println();
    }
  }
}
