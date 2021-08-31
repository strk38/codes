//19101529
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i=1;i<=30;i++){
            if(i<=10 || i>=21)
                System.out.println(i+" from "+getName());
            else{
                Thread2 newthread =new Thread2("Thread 2",i); //creating child
                newthread.start();
                try{
                    newthread.join();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
class Thread2 extends Thread{
    int k=0;
    public Thread2(String name,int j){
        super(name);
        this.k=j;
    }
    public void run() {
            System.out.println(k+" from "+getName());
    }

}


public class Thread1 {
    public static void main(String[] args) {
    MyThread thread1=new MyThread("Thread 1");
    thread1.start();
    }
}
