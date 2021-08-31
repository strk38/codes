import java.io.*;
import java.util.*;


public class Lab01{
    static ArrayList<String> Keyword ;
    static ArrayList<String> Identifiers ;
    static ArrayList<String> Operators ;
    static ArrayList<String> Logical ;
    static ArrayList<String> bool ;
    static ArrayList<String> number ;
    static ArrayList<String> Others ;

    public static void Print(ArrayList<String> x){
        for(int i=0;i<x.size();i++){
            if(i==x.size()-1){
                System.out.print(x.get(i));
            }
            else{
                System.out.print(x.get(i)+", ");
            }
        }
    }

    public static void main(String args[]) throws FileNotFoundException  {

        Scanner sc = new Scanner(new FileReader("input.txt"));
        String []key_wrd={"int","float","double","if","else","do","while","boolean"};
        String []logical={"==",">",">=","<","<=","!="};
        String []operat_ors={"+","-","/","*","%","++","--","="};
        ArrayList<String> Key_List = new ArrayList<String>(Arrays.asList(key_wrd));
        ArrayList<String> Logical_list = new ArrayList<String>(Arrays.asList(logical));
        ArrayList<String> Operators_lists = new ArrayList<String>(Arrays.asList(operat_ors));

         Keyword = new ArrayList<String>();
         Identifiers = new ArrayList<String>();
         Operators = new ArrayList<String>();
         Logical = new ArrayList<String>();
         bool = new ArrayList<String>();
         number = new ArrayList<String>();
         Others = new ArrayList<String>();

        while(sc.hasNext()) {
            String temp = sc.next();
            if(Logical_list.contains(temp)) {
                if(!Logical.contains(temp))
                    Logical.add(temp);
            }

            else if(temp.equals("true")||temp.equals("false")) {
                if(!bool.contains(temp))
                    bool.add(temp);
            }
            else if(Key_List.contains(temp)) {
                if(!Keyword.contains(temp))
                    Keyword.add(temp);
            }
            else if(Operators_lists.contains(temp)) {
                if(!Operators.contains(temp))
                    Operators.add(temp);
            }

            else if(((int)temp.charAt(0)>=65&&(int)temp.charAt(0)<=90)||((int)temp.charAt(0)>=97&&(int)temp.charAt(0)<=122)||((int)temp.charAt(0)==95)) {
                //check if word starts with alphabet / _
                boolean flag=false;
                for(int i=0;i<temp.length();i++){
                    if(!(((int)temp.charAt(i)>=65 && (int)temp.charAt(i)<=90)||((int)temp.charAt(i)>=97 &&
                            (int)temp.charAt(i)<=122)||((int)temp.charAt(i)==95)||((int)temp.charAt(0)>=48 && (int)temp.charAt(0)<=57))){
                        // check if next word contains alphabet / number / _
                        flag=true;
                        break;
                    }
                }
                if(!Identifiers.contains(temp) && flag==false)
                    Identifiers.add(temp);

            }
            else if((int)temp.charAt(0)>=48 && (int)temp.charAt(0)<=57) {
                //check if word starts with number
                boolean flag=false;
                for(int i=0;i<temp.length();i++){
                    if(!((int)temp.charAt(i)>=48 && (int)temp.charAt(i)<=57)&& temp.charAt(i)!='.'){
                        //check next word contains number / .
                        flag=true;
                        break;
                    }
                }
                if(!Identifiers.contains(temp) && flag==false )
                    number.add(temp);
            }
            else {
                if(!Others.contains(temp))
                    Others.add(temp);
            }

        }

        System.out.print("Keywords : ");
        Print(Keyword);


        System.out.println();
        System.out.print("Identifiers : ");
        Print(Identifiers);


        System.out.println();
        System.out.print("Math Operators : ");
        Print(Operators);


        System.out.println();
        System.out.print("Logical Operators : ");
        Print(Logical);


        System.out.println();
        System.out.print("Numerical Values : ");
        Print(number);


        System.out.println();
        System.out.print("Others : ");
        for(int i=0;i<Others.size();i++) {
            System.out.print(Others.get(i)+" ");
        }
    }
}
