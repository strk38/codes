import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lab03 {

    public static void checkRegex(String[] str, Pattern[] R){
        for (String s : str) {
            boolean flag = true;
            for (int j = 0; j < R.length; j++) {
                Matcher m = R[j].matcher(s);
                if (m.find()) {
                    System.out.println("YES, " + (j + 1));
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("NO, 0");
            }
        }
    }

    public static void main(String[] args) {
        try {
            File in = new File("input2.txt");
            Scanner keyboard = new Scanner(in);
            int x = keyboard.nextInt();
            keyboard.nextLine();
            Pattern[] R = new Pattern[x];
            for (int i = 0; i < x; i++) {
                R[i] = Pattern.compile(keyboard.nextLine());
            }
            int y = keyboard.nextInt();
            keyboard.nextLine();

            String[] str = new String[y];
            for (int i = 0; i < y; i++) {
                str[i] = keyboard.nextLine();
            }
            checkRegex(str,R);

        }
        catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}