import java.util.Scanner;
public class Tester {
//    public static void main(String[] args) {
    //       Scanner keyboard=new Scanner(System.in);
//        System.out.print("Enter Radius of Circle :");
    //      double x=keyboard.nextDouble();
    //      System.out.println();
    //      Point p=new Circle(x);
//        System.out.println("Area of Circle : "+p.space());

    //       System.out.print("Enter Radius of Sphere:");
    //      double y=keyboard.nextDouble();
    //       Point p2=new Sphere(y);
    //       System.out.println("Volume of Sphere : "+p2.space());
    //   }
//}
    public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);

        System.out.println("--------------------");

        rn = new ComplexNumber(5, 7);
        System.out.println(rn);

        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }
}
