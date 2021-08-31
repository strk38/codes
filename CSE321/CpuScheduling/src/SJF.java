import java.util.Scanner;
public class SJF {
    static int n; //no. of process
    static int process_id[];
    static int aTime[] ;       // arrival time
    static int bTime[] ;       //burst time
    static int cTime[] ;       //completion time
    static int tAround[] ;     // turn around time
    static int wTime[] ;       //waiting time
    static int flag[] ;
    static int startime=0,total=0;
    static float avgwt=0, avgta=0;
    public static void PrintAll(){
        System.out.println("\nProcess ID  Arrival time  Burst time  Completion time  Turn around time  Waiting time");

        for(int i=0; i<n; i++){
            avgwt+=wTime[i];
            avgta+=tAround[i];
            System.out.println(process_id[i]+"\t\t"+aTime[i]+"\t\t"+bTime[i]+"\t\t"+cTime[i]+"\t\t"+tAround[i]+"\t\t"+wTime[i]);

        }
        System.out.println("\nAverage turn around time is: "+(float)(avgta/n));
        System.out.println("Average waiting time is: "+(float)(avgwt/n));
        for (int i=0; i<n; i++){
            System.out.print(process_id[i]+ " ");
        }
    }

    public static void SJF(){
        while(true){
            int c=n, min= 999;
            if (total==n)
                break;

            for (int i=0; i<n; i++){
                if ((aTime[i]<=startime)&&(flag[i]==0)&&(bTime[i]<min)){   // check for arrival time, process completion with flag, check for burst time
                    min=bTime[i]; // current process with least burst time
                    c=i;
                }

            }
            if (c==n)
                startime++;

            else{

                cTime[c]=startime+bTime[c];
                startime+=bTime[c];
                tAround[c]=cTime[c]-aTime[c];
                wTime[c]=tAround[c]-bTime[c];
                flag[c]=1;              // flag=1 for process completion
                //process_id[total]=c+1;
                total++;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of process:");
         n = sc.nextInt();
         process_id= new int[n]; // for gantt chart
         aTime = new int[n];       // arrival time
         bTime = new int[n];       //burst time
         cTime = new int[n];       //completion time
         tAround = new int[n];     // turn around time
         wTime = new int[n];       //waiting time
         flag = new int[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter process " + (i+1)+" arrival time:");
            aTime[i]=sc.nextInt();
            System.out.println("Enter process " + (i+1) + " burst time:");
            bTime[i] = sc.nextInt();
            process_id[i] = i+1;
            flag[i]=0;
        }
        SJF();
        PrintAll();
    }
}
