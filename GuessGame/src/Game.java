import java.util.*;

public class Game {

    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        Random random= new Random();

        System.out.println("Welcome to the game");
        System.out.println("What's your name?");
        String name = keyboard.next();
        System.out.println("Hello,"+name+" !");

        System.out.println("Do you want to play the game? reply(0/1): 1=Yes, 0=No");
        int i=keyboard.nextInt();
        if(i==1){
            System.out.println("Enter an upperbound in odd");
            int j=keyboard.nextInt();
            int x=random.nextInt(j);

            for (int q=0;q<5;q++){
                System.out.println("Enter a number between upperbound");
                int y=keyboard.nextInt();
                if(x>y){
                    System.out.println("Incorrent!!   Hint: Guess a higher Value");
                }
                else if(x<y){System.out.println("Incorrent!!   Hint: Guess a lower Value");
                }
                else{
                    System.out.println("!!Correct Guess!!");
                    System.out.println("the game has ended");
                    break;
                }
             }
        }
        else{
            System.out.println("U dont want to play. :(");
        }

    }
}
