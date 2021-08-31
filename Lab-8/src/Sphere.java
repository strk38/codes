public class Sphere extends Point {

    public Sphere(double r){
        super(r);
    }
    double space(){
        double r=getRadius();
        double Volume= (4/3)*3.1416*Math.pow(r,3);
        return Volume;
    }

}
