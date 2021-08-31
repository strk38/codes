import java.util.Scanner;
class Name{
  public static void main(String[]args){
  Scanner keyboard=new Scanner (System.in);
   Test99 n=new Test99();
   System.out.println("Enter the text");
   String name=keyboard.next();
   n.simpleMessage(name);
  }
}