public class SJF_preem {
    private static int[] sTime ;
    private static int[] cTime ;
    private static int[] wTime ;
    private static int[] totAvgT ;
    private static double average_wTime;
    private static double average_tat;

    public static void preemptiveScheduling(int[] arrival, int[] bursTime_acTimeual){
        int[]bursTime = bursTime_acTimeual.clone();
        boolean[] completed_flag = new boolean[arrival.length];
        boolean[] sTimearted_flag = new boolean[arrival.length];
        cTime = new int[arrival.length];
        wTime = new int[arrival.length];
        totAvgT = new int[arrival.length];
        sTime = new int[arrival.length];

        int currentTime = 0;
        int total_processes = arrival.length;
        int completed = 0;
        int current_job;

        while(completed!= total_processes){

            current_job = availableShortesTimeJob(arrival,bursTime,completed_flag,currentTime);
            currentTime++;

            if(current_job > -1){
                if(!sTimearted_flag[current_job]){
                    sTime[current_job] = currentTime;
                    sTimearted_flag[current_job ] = true;

                }


                bursTime[current_job]--;
                if(bursTime[current_job] == 0 ){
                    completed_flag[current_job]= true;
                    cTime[current_job] = currentTime;
                    completed++;
                    wTime[current_job]=cTime[current_job]-arrival[current_job]-bursTime_acTimeual[current_job];
                    totAvgT[current_job]= cTime[current_job]-arrival[current_job];

                }

            }


        }



        calculate_avg_wTime_tat();

    }

    private static void calculate_avg_wTime_tat() {
        int sum_wTime = 0;
        int sum_tat = 0;

        for (int i = 0;i<wTime.length;i++){
            sum_wTime +=wTime[i];
            sum_tat += totAvgT[i];
        }

        average_wTime = sum_wTime/(double)wTime.length;
        average_tat = sum_tat/(double)totAvgT.length;

    }

    private static int availableShortesTimeJob(int[] arrival, int[]bursTime, boolean[]completed_flag,int currentTime){

        int min = 2147483647;
        int min_index = -1;
        for( int i =0;i<arrival.length;i++){
            if(arrival[i]<= currentTime && !completed_flag[i]){
                if(bursTime[i]< min){
                    min = bursTime[i];
                    min_index = i;
                }
            }
        }
        // SysTimeem.out.println("min index: "+ min_index);
        return min_index;
    }

    public static int[] get_cTime() {
        return cTime;
    }

    public static int[] get_tat() {
        return totAvgT;
    }

    public static int[] get_wTime() {
        return wTime;
    }

    public static double get_avg_wTime() {
        return average_wTime;
    }

    public static double get_avg_tat() {
        return average_tat;
    }

    public static int[] get_sTime() {
        return sTime;
    }

    public static void main(String[] args) {
        int[] arrival_time ={0,1,2,3};
        int[] bursTime_time = {8,4,9,5};

        SJF_preem.preemptiveScheduling(arrival_time,bursTime_time);

        int[] cTime = SJF_preem.get_cTime();
        System.out.print("Completion time: ");
        for(int i:cTime){
            System.out.print(i+" ");
        }
        System.out.println();


        int[] tat = SJF_preem.get_tat();
        System.out.print("Turnaround time: ");
        for(int i:tat){
            System.out.print(i+" ");
        }
        System.out.println();

        int[] wTime = SJF_preem.get_wTime();
        System.out.print("Waiting time: ");
        for(int i:wTime){
            System.out.print(i+" ");
        }
        System.out.println();

        double avg_wTime = SJF_preem.get_avg_wTime();
        System.out.println("Avg Waiting time: "+ avg_wTime);

        double avg_tat = SJF_preem.get_avg_tat();
        System.out.println("Avg Turnaround time: "+ avg_tat);


        System.out.println();
        System.out.println();

    }
}

