
class A{
    public static int temp = 5;
    public int sum;
    public int y;
    public A(){
        y = temp - 3;
        sum = temp + 2;
        temp-=2;
    }
    public void methodA(int m, int n){
        int x = 1;
        y = y + m + (temp++);
        x = x + 1 +  n;
        sum = sum + x + y;
        System.out.println(x + " " + y+ " " + sum);
    }
}
class B{
    public static int x;
    public int y = 4;
    public int temp = -5;
    public int sum = 2;
    public B(){
        y = temp + 3 ;
        sum = 3 + temp + 3;
        temp-=2;
    }
    public B(B b){
        sum = b.sum;
        x = b.x;
        b.methodB(1,3);
    }
    public void methodA(int m, int n){
        int x = 2;
        System.out.println("y :"+y);
        y = y + m + (temp++);
        System.out.println("y :"+y);
        x = x + 7 +  n;
        sum = sum + x + y;
        System.out.println(x + " " + y+ " " + sum);
    }
    public void methodB(int m, int n){
        int  y = 0;
       // System.out.println("this.y :"+this.y);
        y = y + this.y;
        x = this.y + 3 + temp;
        //System.out.println("x : "+x);
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y+ " " + sum);
    }
}

public class Main {
    public static void main(String[] args) {

        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(3, 2);
        b2.methodB(1, 2);

    }
}
