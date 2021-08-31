public class MPCirc {
    static void MPCircle(int rad){
        int x,y,d;
        x=-rad;
        y=0;
        d=1-rad;
        System.out.println(x+" "+y+" d"+d);
        while(x<y){
            if(d<0){
                System.out.println("S");
                d=d-2*y+3;
            }else{
                System.out.println("SE");
                d=d+2*x-2*y+5;
                x++;
            }
            y--;
            System.out.println(x+" "+y+" D:"+d);
        }
    }
    public static void main(String[] args) {
        //int X1 = 0, Y1 = 0, X2 = -11, Y2 = -9;
        //int z=find_Zone(X1, Y1, X2, Y2);
        MPCircle(15 );
    }
}
