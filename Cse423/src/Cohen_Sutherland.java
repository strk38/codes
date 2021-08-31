import java.util.*;
public class Cohen_Sutherland {
    static float x_max=201,x_min=-106;
    static float y_max=119,y_min=-62;
    static int Inside=0,left=1,Right=2,Bottom=4,Top=8;

    public static int Region(float x,float y){
        int code=0;
        if(x<x_min){
            code=left;
        }else if(x>x_max){
            code=Right;
        }
        if(y<y_min){
            code=Bottom;
        }else if(y>y_max){
            code=Top;
        }
        System.out.println("Code: "+code);
        return code;
    }

    public static void CohenSutherLand(float x1, float y1, float x2,float y2){
        int code1=Region(x1,y1);
        int code2=Region(x2,y2);
        Boolean check=false;
        while(true) {
            if (code1 == 0 && code2 == 0) {
                check = true;
                //System.out.println("The line is visible for" + "x1:" + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);
                break;
            }
            else if ((code1 & code2) != 0) {
                //System.out.println("Invisible points" + x1 + "," + y1 + " and " + x2 + "," + y2);
                break;
            }
            else {
               float x = 0, y = 0;
               float m = (y2 - y1) / (x2 - x1);
                int NewCode = 0;
                if (code1 != 0) {
                    NewCode = code1;
                } else {
                    NewCode = code2;
                }

                if (NewCode == Top) {
                    x = x1 + (y_max - y1) / m;
                    y = y_max;
                } else if (NewCode == Bottom) {
                    x = x1 + (y_min - y1) / m;
                    y = y_min;
                } else if (NewCode == left) {
                    y = y1 + (x_min - x1) * m;
                    x = x_min;
                } else if (NewCode == Right) {
                    y = y1 + (x_max - x1) * m;
                    x = x_max;
                }
                //Relace the obtained points
                if (NewCode == code1) {
                    x1 = x;
                    y1 = y;
                    System.out.println("NewCode "+x1+","+y1);
                    code1 = Region(x1, y1);
                } else {
                    x2 = x;
                    y2 = y;
                    System.out.println("NewCode "+x2+","+y2);
                    code2 = Region(x2, y2);
                }
            }
        }
        if(check){
            System.out.println("The line is visible for x1:" + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);
        }else{
            System.out.println("Invisible for" + " x1:" + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);
        }

    }

    public static void main(String[] args) {
        CohenSutherLand(197,-59,-178,-162);
        /*CohenSutherLand(50,-105,150,-200);
        CohenSutherLand(-160,140,-240,80);
        CohenSutherLand(-300,120,250,-110);*/

    }

}
