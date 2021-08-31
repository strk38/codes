import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BankersAlgo {
    static int no_of_process,no_of_resources;
    static String []process;
    static int [][]max;
    static int [][]allocation;
    static int [][]need;
    static int [][]available;
    static LinkedList<Integer> track;

    public static void PrintNeed(){
        System.out.println("Need Matrix: ");
        for(int i=0;i<no_of_process;i++){
            for(int j=0;j<no_of_resources;j++){
                System.out.print(need[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Print_Safe_Seq(){
        System.out.println("Safe sequence:");
        for(int i=0;i<track.size();i++){
            System.out.print(process[track.get(i)]+" ");
        }
        System.out.println();
    }
    public static void Print_Available(){
        System.out.println("Available resource matrix");
        for(int i=1;i<available.length;i++){
            for(int j=0;j<no_of_resources;j++){
                System.out.print(available[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Check_SafeSeq(){
        int counter=0;
        for(int i=0;;i++){
            i=i%no_of_process;
            boolean flag=true;
            for(int j=0;j<no_of_resources;j++){
                if(need[i][j]<=available[counter][j]){}
                else{
                    flag=false;
                    break;
                }
                if(flag && j==no_of_resources-1 && !track.contains(i)){
                    for(int k=0;k<no_of_resources;k++){
                        available[counter+1][k]=available[counter][k]+allocation[i][k];
                    }
                    track.addLast(i);
                    counter++;
                }
            }
            if(track.size()==no_of_process){
                break;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader b= new BufferedReader(new FileReader("abd.txt"));
        no_of_process=Integer.parseInt(b.readLine());
        no_of_resources=Integer.parseInt(b.readLine());

        process=new String[no_of_process];
        max=new int[no_of_process][no_of_resources];
        allocation=new int[no_of_process][no_of_resources];
        need=new int[no_of_process][no_of_resources];
        available=new int[no_of_process+1][no_of_resources];
        track=new LinkedList<>();

        String s3=b.readLine();
        StringTokenizer st3=new StringTokenizer(s3," ");
        int n=0;
        while(st3.hasMoreTokens()){
            process[n]=st3.nextToken();
            n++;
        }

        /*reading values of Max*/
        for(int i=0;i<no_of_process;i++){
            String s=b.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            for(int j=0;j<no_of_resources;j++){
                max[i][j]=Integer.parseInt((st.nextToken()));
            }
        }

        /*reading Allocation value and calculating need*/
        for(int i=0;i<no_of_process;i++){
            String s=b.readLine();
            StringTokenizer st=new StringTokenizer(s," ");
            for(int j=0;j<no_of_resources;j++){
                allocation[i][j]=Integer.parseInt((st.nextToken()));
                need[i][j]=max[i][j]-allocation[i][j];
            }
        }

        /*reading Available Resources values*/
        String s=b.readLine();
        StringTokenizer st=new StringTokenizer(s," ");
        int counter=0;
        while(st.hasMoreTokens()){
            available[0][counter]=Integer.parseInt(st.nextToken());
            counter++;
        }


        PrintNeed();
        Check_SafeSeq();
        Print_Safe_Seq();

        System.out.println();

        Print_Available();

    }
}
