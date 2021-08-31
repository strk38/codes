import java.util.Scanner;


public class RoundRobin {
    static int aTime[] ;
    static int bTime[];
    static int cTime[] ;       //completion time
    static int tAround[] ;
    static int wTime[] ;
    static int rTime[],sTime[];
    static int quantum,n;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of process:");
        n = sc.nextInt();
        //int process_id[] = new int[n];
        aTime = new int[n];
        cTime = new int[n];
        tAround = new int[n];
        bTime = new int[n]; // burst time
        rTime = new int[n]; // remaining time
        wTime = new int[n]; // waiting time

        //int total;
        for (int i = 0; i < n; i++) {

            aTime[i]=0;

            System.out.println("Enter process " + (i + 1) + " burst time:");
            bTime[i] = sc.nextInt();

            rTime[i] = bTime[i];
            wTime[i] = 0;
        }
        System.out.println("Enter quantum: ");
        quantum = sc.nextInt();
        RoundRobin();
        PrintAll();
    }
    public static void PrintAll(){
        int avgTa=0,avgWt=0;
        for (int i=0; i<n; i++){
            avgWt+=wTime[i];
            avgTa+=tAround[i];

        }
        System.out.println("\nCompletionTime TurnAroundTime  WaitingTime ");

        for(int i=0; i<n; i++){
            System.out.println( cTime[i]  + "\t\t" + tAround[i] + "\t\t" + wTime[i]);

        }
        System.out.println("\nAverage turn around time is: "+(avgTa/n));
        System.out.println("Average waiting time is: "+(avgWt/n));

    }
    public static void RoundRobin(){
        int rProcess = n;
        int i = 0;
        int time = 0;
        System.out.println("0");

        while(rProcess!=0){
            if (rTime[i]>quantum){
                rTime[i]=rTime[i]-quantum;
                System.out.print(" | Process: "+(i+1)+" | ");
                time+=quantum;
                System.out.print("T"+time);
            }
            else if (rTime[i]<=quantum && rTime[i]>0){
                time+=rTime[i];
                rTime[i]=rTime[i]-rTime[i];
                tAround[i]=time-aTime[i];
                wTime[i]=tAround[i]-bTime[i];
                cTime[i]=time;
                System.out.print(" | Process: " + (i + 1) + " | ");
                rProcess--;
                System.out.print("T"+time);
            }
            i++;
            if(i==n){
                i=0;
            }
        }
    }
}
