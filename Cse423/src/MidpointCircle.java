public class MidpointCircle {
    static void MPCircle(int rad,int z){
        int x,y,d;
        x=0;
        y=rad;
        d=1-rad;
        System.out.println(x+" "+y+" d"+d);
        while(x<y){
            if(d<0){
                System.out.println("E");
                d=d+2*x+3;
            }else{
                System.out.println("SE");
                d=d+2*x-2*y+5;
                y--;
            }x++;
            System.out.println(x+" "+y+" D:"+d+" ORI_z"+"x_z"+Convrt1_to_X(x,y,z)+"y_z:"+Convrt1_to_Y(x,y,z));
        }
    }
    public static int find_Zone(int x1, int y1, int x2, int y2){
        int dx=x2-x1;
        int dy=y2-y1;
        int zone=-1;

        if(Math.abs(dx)>Math.abs(dy)){
            if(dx>0 && dy>0)
                zone=0;
            else if(dx>0 && dy<0)
                zone=7;
            else if(dx<0 && dy>0)
                zone=3;
            else
                zone=4;
        }
        else{
            if(dx>0 && dy>0)
                zone=1;
            else if(dx>0 && dy<0)
                zone=6;
            else if(dx<0 && dy>0)
                zone=2;
            else
                zone=5;
        }
        return zone;
    }
    public static int Convrt1_to_X(int x,int y,int zone){
        int X;

        if(zone==0){
            X=y;
        }
        else if(zone==2){
            X=-x;
        }
        else if(zone==3){
            X=-y;
        }
        else if(zone==4){
            X=-y;
        }
        else if(zone==5){
            X=-x;
        }
        else if(zone==6){
            X=x;
        }
        else if(zone==7){
            X=y;
        }
        else{ //if Already in zone0
            X=x;
        }
        return X;
    }
    public static int Convrt1_to_Y(int x,int y,int zone){
        int Y;

        if(zone==0){
            Y=x;
        }
        else if(zone==2){
            Y=y;
        }
        else if(zone==3){
            Y=x;
        }
        else if(zone==4){
            Y=-x;
        }
        else if(zone==5){
            Y=-y;
        }
        else if(zone==6){
            Y=-y;
        }
        else if(zone==7){
            Y=-x;
        }
        else{ //if Already in zone0
            Y=y;
        }
        return Y;
    }

    public static void main(String[] args) {
        //int X1 = 0, Y1 = 0, X2 = -11, Y2 = -9;
        //int z=find_Zone(X1, Y1, X2, Y2);
        int z=4;
        MPCircle(15,z);
    }
}
