
public class Vehicle {
    private int x=0,y=0;

    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }

    public String toString(){
        return"("+ x +","+y +")";
    }

    public void setY(int y){
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
