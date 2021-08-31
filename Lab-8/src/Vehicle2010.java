public class Vehicle2010 extends Vehicle {

    public void moveLowerLeft(){
        int x = getX();
        super.setX(--x);
        int y = getY();
        super.setY(--y);
    }
    public void moveLowerRight(){
        int x = getX();
        super.setX(++x);
        int y = getY();
        super.setY(--y);
    }
    public void moveUpperLeft(){
        int x = getX();
        super.setX(--x);
        int y = getY();
        super.setY(++y);
    }
    public void moveUpperRightt(){
        int x = getX();
        super.setX(++x);
        int y = getY();
        super.setY(++y);
    }
    public boolean equals(Vehicle2010 b){
        return (super.getX()==b.getX()) && (super.getY()==b.getY());
    }

}
