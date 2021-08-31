import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    System.out.println("Enter a String");
  Scanner keyboard=new Scanner(System.in);
  String s=keyboard.next();
  char[] a= s.toCharArray();
  
  int index=keyboard.nextInt();
  System.out.println(a[index]);
  
  }
}