import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    
   
  Scanner keyboard=new Scanner(System.in);
  StringHelper helper=new StringHelper();
  
   System.out.println("Enter first String :");
  String s1=keyboard.next();
  char[] firstInput= s1.toCharArray();
  
  System.out.println("Enter second String :");
  String s2=keyboard.next();
  char[] secondInput= s2.toCharArray();
  
  System.out.println("Using Built-in: "+s1.startsWith(s2));

   System.out.println("Is Prefix: "+helper.StartsWith(firstInput,secondInput));
  }
}