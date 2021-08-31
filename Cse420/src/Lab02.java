import java.util.ArrayList;
import java.util.Scanner;

public class Lab02 {

    static boolean WebCheck(String s) {
        String first = "", last = "";
        last = s.substring(4, s.length()); //storing the part after www.
        if (last.contains(".") && last.charAt(0) != '.' && last.charAt(0) != '-') {
            for (int j = last.length() - 1; j >= 0; j--) {
                if (last.charAt(j) == '.') {
                    first = last.substring(0, j);
                    last = last.substring(j + 1);
                    //store into two parts
                    break;
                }
            }
        } else {
            return false;
        }

        return Check_first(first) && Check_last(last);
    }
    
    static boolean MailCheck(String s) {
        String first = "", last = "", middle = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                first = s.substring(0, i);      //part before @
                last = s.substring(i + 1);      //part after @
                if (last.contains(".") && last.charAt(0) != '.' && last.charAt(0) != '-') {
                    for (int j = last.length() - 1; j >= 0; j--) {
                        if (last.charAt(j) == '.') {
                            middle = last.substring(0, j);   //gmail
                            last = last.substring(j + 1);    //com
                            break;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return Check_first(first) && Check_middle(middle) && Check_last(last);
    }

    static boolean Check_first(String s) {
        if (s.length() == 0 || !isLetter(s.charAt(0))) {
            return false;
        }
        return check(s);

    }

    static boolean Check_middle(String s) {
        if (s.length() == 0 || !isLetter(s.charAt(0))) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isNumber(s.charAt(i))) {
                return false;
            }
        }
        return check(s);
    }

    static boolean Check_last(String s) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!isLetter(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean check(String s) {
        boolean prevDot = false;
        boolean prevOther = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.') {
                if (prevDot || prevOther) {
                    return false;
                } else {
                    prevDot = true;
                }
            } else if (c == '-') {
                if (prevDot) {
                    return false;
                } else {
                    prevOther = true;
                }
            } else if (isLetter(c) || isNumber(c)) {
                prevDot = false;
                prevOther = false;
            } else {
                return false;
            }
        }
        return !(prevDot || prevOther);
    }

    static boolean isLetter(char c) {
        return (int) c >= 97 && (int) c <= 122;
    }

    static boolean isNumber(char c) {
        return (int) c >= 48 && (int) c <= 57;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of cases you want to check");
        int n = keyboard.nextInt();
        keyboard.nextLine();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = keyboard.nextLine();
        }
        ArrayList<Integer> mail = new ArrayList<Integer>();
        ArrayList<Integer> web = new ArrayList<Integer>();
        ArrayList<Integer> invalid = new ArrayList<Integer>();
        for (int i = 0; i < str.length; i++) {
            String s = str[i].toLowerCase();
            if (s.contains("@") && MailCheck(s)) {
                mail.add(i + 1);
            } else if (s.startsWith("www.") && WebCheck(s)) {
                web.add(i + 1);
            } else {
                invalid.add(i + 1);
            }

        }
        System.out.print("Email");
        for (int i : mail) {
            System.out.print(", " + i);
        }
        System.out.println();

        System.out.print("Web");
        for (int i : web) {
            System.out.print(", " + i);
        }
        System.out.println();

        System.out.print("Invalid");
        for (int i : invalid) {
            System.out.print(", " + i);
        }
        System.out.println();

    }

}
