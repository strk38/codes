public class Circle extends Point{

    public Circle(double r){
        super(r);
        System.out.println("Creating a Circle...Done!!");
    }
    double space(){
        double r=getRadius();
        double Area=3.146*r*r;
        return Area;
    }
}
