public class StaticMethod {

    static  String x="10";
    int y=5;
    StaticMethod(){

    }

    StaticMethod(String n,int _y){
        y=_y;
        x=n;
    }

    void display1(){
        display2();
        System.out.println("print "+x);
        System.out.println(" print "+y);
    }

    static void display2(){
        System.out.println(" Show "+x);

    }

    public void dekhaoshob(){
        System.out.println("X holo "+x+" Y holo "+y);
    }
}

