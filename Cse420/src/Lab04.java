import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lab04 {

    public static void Identify(String input){
        String inLower = input.toLowerCase();
        String type_nd_Name = "((byte|short|int|long|float|double|boolean|char|void|string)\\s+[a-z][a-z0-9]*)";
        String pattern ="((public|private|protected)\\s+)?(static\\s+)?"+ type_nd_Name + "\\s*\\(((" + type_nd_Name + "\\s*,\\s*)*" + type_nd_Name + "\\s*)?\\)";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inLower);
        String result = "";

        while (m.find()) {
            int start = m.start();
            int end = m.end();
            Scanner s = new Scanner(input.substring(start, end));
            String type = s.next();
            while(type.equalsIgnoreCase("public") || type.equalsIgnoreCase("private") || type.equalsIgnoreCase("protected") || type.equalsIgnoreCase("static")){
                type=s.next();
            }
            String Parameter_Name = s.nextLine().trim();
            result += Parameter_Name + ", return type: " + type + "\n";
        }
        System.out.print("Methods:\n" + result);
    }

    public static void main(String[] args) {
        try {
            File in = new File("input3.txt");
            Scanner keyboard = new Scanner(in);
            String input = "";

            while (keyboard.hasNextLine()) {
                input += keyboard.nextLine();
            }
            Identify(input);

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}