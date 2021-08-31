public class circle {
    private double radius=1.0;
    private String color="red";

    public void setRadius(double R){radius=R;}
    public double getRadius(){return radius;}

    public void setColor(String c){color=c;}
    public String getColor(){return color;}

    circle()
    { }
    circle(double R){radius=R;}
    public double getArea(){return 3.1416*radius*radius;}
    public void printshob(){
        System.out.println(getRadius()+" "+getArea()+" "+getColor());
    }
    public static void main(String[] args) {
        circle c=new circle();
        c.printshob();
        circle c1=new circle(5);
        c1.printshob();}
}
