/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19101529
 */
public class CircularArray{

    private int start;
    private int size;
    private Object [] cir;

    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        start=st;
        size=sz;

        cir=new Object[lin.length];
        for(int i=0,s=start;i<size;i++){
            cir[(i+s)%cir.length]=lin[i];
            //s=(i+s)%cir.length;
        }

    }

    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){

        for(int i=0;i<cir.length;i++){
            System.out.print(cir[i]+" ");
        }
        System.out.println();

    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){

        for( int s=start; s<size+start;s++){

            System.out.print(cir[s%cir.length]+" ");


            //s=(s+1)%cir.length;
        }
        System.out.println();
    }


    public void printBackward(){

        for( int s=size-1;s>=0;s--){

            System.out.print(cir[(s+start)%cir.length]+" ");
            //s=(s+1)%cir.length;
        }

        System.out.println();
    }

    // With no null cells
    public void linearize(){
        Object lin[]=new Object[size];
        for(int i=0,st=start;i<size;i++){
            lin[i]=cir[(st+i)%cir.length];
            //st=(st+1)%cir.length;
        }
        cir=lin;
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        Object arr[]=new Object[newcapacity];
        int x=start,y=start;
        for(int i=y;i<newcapacity-1;i++){
            arr[i]=cir[x];
            x=(x+1)%cir.length;
            //y=(y+1)%size;
        }
        cir=arr;
    }

    // Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        Object arr[]=new Object[newcapacity];
        int y=start;
        for(int i=0;i<size;i++){
            arr[i]=cir[y];

            y=(y+1)%cir.length;
        }
        cir=arr;
    }

    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
     if(pos<=size && pos>=0) {
         if (size == cir.length)
             resizeStartUnchanged(size + 3);
       // for(int j=0;j<cir.length;j++){
            //System.out.print(cir[j]+" ");}

         //System.out.println(" "+start);
         int nshift=size+3-pos;
         int f=(start-1+size+3-1)%cir.length;
         for (int i = 0;i<nshift;i++){
            int t=(f+1)%cir.length;
            cir[t]=cir[f];
            --f;
            if(f<0)
                f=cir.length-1;
         }
         cir[(start+pos)%cir.length]=elem;
     }
    }

    public void insertByLeftShift(Object elem, int pos){
        if(pos<=size && pos>=0) {
            if (size == cir.length)
                resizeStartUnchanged(size+3);
            int nshift=pos+1;
            int f=start;
            int t=f-1;
            for (int i = 0;i<nshift;i++){
                if(t<0)
                    t=cir.length-1;
                cir[t]=cir[f];
                t=f;
                f=(f+1)%cir.length;

            }
            cir[(start+pos)%cir.length]=elem;
            start=start-1;
            size=cir.length-1;
        }
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        //TO DO
        int n=size-1-pos;
        int t=start+pos;
        System.out.println(size+" "+start);

        for(int i=0;i<n;i++){
            int f=(t+1)%cir.length;
            cir[t]=cir[f];
            t++;
        }
        cir[(start+pos+1)%cir.length]=null;
        --size;
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        //TO DO
        int n=size;
        int t=(start+pos)%cir.length;

        for(int i=0;i<n;i++){
            int f=(t-1)%cir.length;
            cir[t]=cir[f];
            t--;
            if(t==-1) t=cir.length-1;
        }start++;
        size--;
    }


    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        //TO DO
        boolean value=true;
        int n=size/2;
        int s=start,t=start+size-1;
      //System.out.println(cir.length+" "+size+" "+cir[0]+" "+cir[1]+" "+cir[2]+" "+cir[3]+" "+cir[4]+" "+cir[5]+" "+cir[6]);
        for(int c=0;c<n;c++){
            if(t==-1)t=cir.length-1;
            if(cir[s%cir.length]==cir[t%cir.length])
                value=true;
            else
                value=false;
            t--;
            s++;
        }if(value==true)
            System.out.println("This array is a palindrome.");
        else System.out.println("This array is NOT a palindrome.");
    }



    //This method will sort the values by keeping the start unchanged
    public void sort() {
        //TO DO
        linearize();
        int st=start;
        for (int i=0;i<cir.length;i++){
            for (int j=i+1;j<cir.length;j++){
                if ((int)cir[i]>(int)cir[j]){
                    int temp=(int)cir[i];
                    cir[i]=cir[j];
                    cir[j]=temp;
                }
            }
        }
        Object circ[]=new Object[cir.length];
        for (int i=0;i<cir.length;i++,st++){
            circ[st%circ.length]=cir[i];
        }
        cir=circ;
    }

    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public  boolean equivalent(CircularArray k){
        int st=start;
        int stk=k.start;
        boolean bol=true;
        if (size!=k.size){
            bol=false;
        }else{
            for (int i=0;i<size;i++,st++,stk++){
                if(cir[st%cir.length]!=k.cir[stk%k.cir.length]){
                    bol=false;
                }
            }
        }

        return bol; // Remove this line
    }
}
