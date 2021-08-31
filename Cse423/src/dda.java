import java.util.Scanner;
public class dda {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please input x0");
        int x0=sc.nextInt();
        System.out.println("Please input y0");
        int y0=sc.nextInt();
        System.out.println("Please input x1");
        int x1=sc.nextInt();
        System.out.println("Please input y1");
        int y1=sc.nextInt();

        System.out.println(x0+"  "+y0);

        double dy=y1-y0;
        double dx=x1-x0;

        System.out.println("The value of dY is "+dy);
        System.out.println("The value of dY is "+dx);

        //m is the gradient
        double m=dy/dx;

        System.out.println("The gradient m is "+m);
        double x=x0;
        double y=y0;


        // For moving from left to right
        if(x0<=x1){
            while(x<=x1 && y<=y1) {

                if(m<1 && m >-1) {
                    x = x + 1;
                    y = y + (m*1);
                    System.out.println(x+"  "+y);
                }

                else {
                    y = y + 1;
                    x = x + (1/m);
                    System.out.println(x+"  "+y);
                }



            }

        }
        //For moving from right to left
        else {

            while(x>=x1 && y>=y1) {

                if(m<1 && m >-1) {
                    x = x - 1;
                    y = y - (m*1);
                    System.out.println(x+"  "+y);
                }

                else {
                    y = y - 1;
                    x = x - (1/m);
                    System.out.println(x+"  "+y);
                }


            }


        }


    }

}