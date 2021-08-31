import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    System.out.println("Enter a String :");
  Scanner keyboard=new Scanner(System.in);
  String s=keyboard.next();
  char[] input= s.toCharArray();

      StHlpr helper=new StHlpr();

      System.out.println("Enter a number :");
      int index=keyboard.nextInt();

      System.out.println("Character is "+helper.CharAt(input,index));
      System.out.println("Character at "+helper.length(input));
  }
}