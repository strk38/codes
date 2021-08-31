public class MPLine {

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

        public static int ConvrtO_to_X(int x,int y,int zone){
            int X;

            if(zone==1){
                X=y;
            }
            else if(zone==2){
                X=-y;
            }
            else if(zone==3){
                X=-x;
            }
            else if(zone==4){
                X=-x;
            }
            else if(zone==5){
                X=-y;
            }
            else if(zone==6){
                X=y;
            }
            else if(zone==7){
                X=x;
            }
            else{ //if Already in zone0
                X=x;
            }
            return X;
        }
        public static int ConvrtO_to_Y(int x,int y,int zone){
            int Y;

            if(zone==1){
                Y=x;
            }
            else if(zone==2){
                Y=x;
            }
            else if(zone==3){
                Y=y;
            }
            else if(zone==4){
                Y=-y;
            }
            else if(zone==5){
                Y=-x;
            }
            else if(zone==6){
                Y=-x;
            }
            else if(zone==7){
                Y=-y;
            }
            else{ //if Already in zone0
                Y=y;
            }
            return Y;
        }
        public static int Convrt_x_to_O(int x,int y, int zone){
            if(zone==1)
                x=y;
            else if (zone==2)
                x=y;
            else if (zone==3)
                x=-x;
            else if (zone==4)
                x=-x;
            else if (zone==5)
                x=-y;
            else if (zone==6)
                x=-y;
            else if (zone==7)
                x=x;
            return x;
        }
        public static int Convrt_y_to_O(int x,int y, int zone){
            if(zone==1)
                y=x;
            else if (zone==2)
                y=-x;
            else if (zone==3)
                y=y;
            else if (zone==4)
                y=-y;
            else if (zone==5)
                y=-x;
            else if (zone==6)
                y=x;
            else if (zone==7)
                y=-y;
            return y;
        }

        static void MidPoint(int x1,int y1,int x2,int y2,int z){
            int dx=x2-x1;
            int dy=y2-y1;
            int d=-2*dy+dx;
            int dW=-dy*2;
            int dSW=2*(-dy+dx);
            int X=x1,Y=y1;
            int i=0;
            int zone=z;
            System.out.println("D: "+d+" dSW: "+dSW+" dW: "+dW);
            System.out.println(X+" "+Y+" D: "+d);
            while(X>x2){
                if(d<=0){
                    System.out.println("Pixel chosen dW");
                    //System.out.println(X+" "+Y+" D: "+d+" E "+" D_update "+(d+dW)+"  ");
                    d=d+dW;
                    //X--;
                }
                else{
                    System.out.println("Pixel chosen dSW");
                    //System.out.println(X+" "+Y+" D: "+d+" NE "+" D_update "+(d+dSW)+"  ");
                    d=d+dSW;
                    //X--;
                    Y--;
                }
                X--;
                System.out.println(X+" "+Y+" D: "+d);
                //i++;
            }

        }

        public static void main (String[] args)
        {
            int X1 = 10, Y1 = 5, X2 = 1, Y2 = 1;
            int z=find_Zone(X1, Y1, X2, Y2);
            System.out.println("Zone: "+z);
            MidPoint(X1, Y1, X2, Y2,z);
            //converting to z0 manually
            /*if(z==0){
                MidPoint(X1, Y1, X2, Y2,z);
            }
            else if(z==1){
                MidPoint(Y1, X1, Y2, X2,z);
            }
            else if(z==2){
                MidPoint(Y1, -X1, Y2, -X2,z);
            }
            else if(z==3){
                MidPoint(-X1, Y1, -X2, Y2,z);
            }
            else if(z==4){
                MidPoint(-X1, -Y1, -X2, -Y2,z);
            }
            else if(z==5){
                MidPoint(-Y1, -X1, -Y2, -X2,z);
            }
            else if(z==6){
                MidPoint(-Y1, X1, -Y2, X2,z);
            }
            else if(z==7){
                MidPoint(X1, -Y1, X2, -Y2,z);
            }
            else{
                System.out.println("Wrong input");
            }*/


        }
    }

