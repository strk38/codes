//19101529
class thread0 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=1;n<10001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread1 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=10001;n<20001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread2 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=20001;n<30001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread3 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=30001;n<40001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread4 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=40001;n<50001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread5 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=50001;n<60001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread6 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=60001;n<70001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread7 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=70001;n<80001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread8 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=80001;n<90001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

class thread9 extends Thread{
    int noOfDivisor=-1,number=-1;
    public void run(){
        for(int n=90001;n<100001;n++){
            int counter=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    counter++;
            }if(counter>noOfDivisor){
                noOfDivisor=counter;
                number=n;
            }
        }
        System.out.println("from "+Thread.currentThread().getName());
    }
    public int[] getArray(){
        int array[]={noOfDivisor,number};
        return array;
    }
}

public class Task2 {
    public static void main(String[] args) {
        int j=0;
        int []number=new int[10];
        int []DivsorNo=new int[10];
         thread0 t0 =new thread0();
         t0.start();
         try{
             t0.join();
         }catch (InterruptedException e){
             e.printStackTrace();
         }
         int Array0[]=t0.getArray();
         DivsorNo[j]=Array0[0];
         number[j]=Array0[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
         j++;
//Start thread1
        thread1 t1 =new thread1();
        t1.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array1[]=t1.getArray();
        DivsorNo[j]=Array1[0];
        number[j]=Array1[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;

        //start thread2
        thread2 t2 =new thread2();
        t2.start();
        try{
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array2[]=t2.getArray();
        DivsorNo[j]=Array2[0];
        number[j]=Array2[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        
        //Start t3
        thread3 t3 =new thread3();
        t3.start();
        try{
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array3[]=t3.getArray();
        DivsorNo[j]=Array3[0];
        number[j]=Array3[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        
        //start t4
        thread4 t4 =new thread4();
        t4.start();
        try{
            t4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array4[]=t4.getArray();
        DivsorNo[j]=Array4[0];
        number[j]=Array4[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        
        //start t5
        thread5 t5 =new thread5();
        t5.start();
        try{
            t5.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array5[]=t5.getArray();
        DivsorNo[j]=Array5[0];
        number[j]=Array5[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        
        //satrt t6
        thread6 t6 =new thread6();
        t6.start();
        try{
            t6.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array6[]=t6.getArray();
        DivsorNo[j]=Array6[0];
        number[j]=Array6[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        
        //start7
        thread7 t7 =new thread7();
        t7.start();
        try{
            t7.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array7[]=t7.getArray();
        DivsorNo[j]=Array7[0];
        number[j]=Array7[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        
        //start t8
        thread8 t8 =new thread8();
        t8.start();
        try{
            t8.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array8[]=t8.getArray();
        DivsorNo[j]=Array8[0];
        number[j]=Array8[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        
        //start t9
        thread9 t9 =new thread9();
        t9.start();
        try{
            t9.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int Array9[]=t9.getArray();
        DivsorNo[j]=Array9[0];
        number[j]=Array9[1];
        System.out.println("The number is: "+number[j]+" The divisor no. is "+DivsorNo[j]);
        j++;
        int remember=-1;
        for(int i=0;i<10;i++){
            for(int k=0;k<i;k++){
                if((DivsorNo[i]>DivsorNo[k])||(DivsorNo[i]==DivsorNo[k])){
                    //selecting Largest or Latest from equal no. of divisor
                    remember=i;
                }else{
                    remember=k;
                }
            }
        }
        System.out.println("Number having Highest divisor: "+number[remember]);
        System.out.println("Time Elasped: "+System.currentTimeMillis());
    }
}
