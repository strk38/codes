import java.util.Scanner;

public class Priority {
    static int n,save;
    static int process_id[];
    static int  Priority[] ;
    static int bTime[] ;
    static int tAround[] ;
    static int wTime[] ;
    static float avgwt=0, avgta=0;
    public static void PrintAll(){
        wTime[0]=0;
        tAround[0]=bTime[0];
        avgta=tAround[0];
        //finding average
        for (int i=1; i<n; i++){
            wTime[i]=tAround[i-1];
            avgwt+=wTime[i];
            tAround[i]=wTime[i]+bTime[i];
            avgta+=tAround[i];

        }
        System.out.println("\nProcessID  BurstTime TurnAroundTime  WaitingTime Priority");

        for(int i=0; i<n; i++){
            System.out.println(process_id[i] + "\t\t" + bTime[i]  + "\t\t" + tAround[i] + "\t\t" + wTime[i] + "\t\t" + Priority[i]);

        }
        System.out.println("\nAverage turn around time is: "+(float)(avgta/n));
        System.out.println("Average waiting time is: "+(float)(avgwt/n));
        System.out.println("Gnatt Chart:");
        for (int i=0; i<n; i++){
            System.out.print(process_id[i]+ " ");
        }
    }

    public static void PrioritySort(){
        for(int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if(Priority[i]>Priority[j]){
                    save=Priority[i];
                    Priority[i]=Priority[j];
                    Priority[j]=save;
                    save=bTime[i];
                    bTime[i]=bTime[j];
                    bTime[j]=save;
                    save=process_id[i];
                    process_id[i]=process_id[j];
                    process_id[j]=save;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of process:");
        n = sc.nextInt();
        process_id= new int[n];
        Priority = new int[n];
        bTime = new int[n];
        tAround = new int[n];
        wTime = new int[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter process " + (i+1)+" burst time:");
            bTime[i]=sc.nextInt();
            System.out.println("Enter process " + (i+1) + " Priority:");
            Priority[i] = sc.nextInt();
            process_id[i] = i+1;
        }
        PrioritySort();
        PrintAll();
    }
}
