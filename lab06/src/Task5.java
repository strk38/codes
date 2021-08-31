import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=keyboard.next();
        int a[]=new int[26];

       for(int i=0;i<s.length();i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                for (int j = 0; j < i; j++) {
                    a[j] = s.charAt(i);
                  System.out.println("Uppercase letter:"+a[j]);
               }
           }
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int codeForCh = (int) ch;
            a[ch-65]++;
            }
        int temp=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        System.out.println((char)a[5]);


    }
}
