import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class Level3 {

    private static void addEdge(ArrayList<ArrayList<Integer>>adj, int i, int j){
        adj.get(i).add(j);
        //adj.get(j).add(i);
    }
    private static int ShortestDistance(ArrayList<ArrayList<Integer>>adj, int s, int dest, int v){
        int pred[]= new int[v];
        int dist[]= new int[v];
        if (BFS(adj,s,dest,v,pred,dist)==false){
            System.out.println("source and destination not connected");
            return -1;
        }
        LinkedList<Integer> path=new LinkedList<Integer>();
        int crawl=dest;
        path.add(crawl);
        while(pred[crawl]!=-1){
            path.add(pred[crawl]);
            crawl=pred[crawl];
        }
        return dist[dest];
    }
    public static void compare(int x,int y){
        if(x<y)
            System.out.println("Nora winner");
        else if(x>y)
            System.out.println("Lara winner");
        else
            System.out.println("Both are winner");
    }
    public static void Min(int a[]){
        int m=100000;
        int l=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<m){
                m=a[i];
                l=i;
            }
        }
        System.out.println(m+" moves by k"+(l+1));
    }
    private static boolean BFS(ArrayList<ArrayList<Integer>>adj, int src, int dest, int v, int pred[], int dist[]){
        LinkedList<Integer>queue= new LinkedList<Integer>();
        boolean visited[]=new boolean[v];
        for(int i=0;i<v;i++){
            visited[i]=false;
            dist[i]=Integer.MAX_VALUE;
            pred[i]=-1;
        }
        visited[src]=true;
        dist[src]=0;
        queue.add(src);
        while(!queue.isEmpty()){
            int u=queue.remove();
            for(int i=0;i<adj.get(u).size();i++){
                if(visited[adj.get(u).get(i)]==false){

                    visited[adj.get(u).get(i)]=true;
                    dist[adj.get(u).get(i)]=dist[u]+1;
                    pred[adj.get(u).get(i)]=u;
                    queue.add(adj.get(u).get(i));

                    if(adj.get(u).get(i)==dest)
                        return true;
                }
            }
        }return false;
    }

    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter number of vertices, v: ");
        int v=keyboard.nextInt();

        System.out.println("Enter number of connections,edge: ");
        int e=keyboard.nextInt();

        ArrayList<ArrayList<Integer>>adj= new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<e;i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,0,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,2,3);
        addEdge(adj,3,5);
        addEdge(adj,4,7);
        addEdge(adj,4,8);
        addEdge(adj,5,6);
        addEdge(adj,6,7);
        addEdge(adj,6,9);
        addEdge(adj,7,8);
        addEdge(adj,8,9);


        System.out.println("Enter Linas position: ");
        int dest=keyboard.nextInt();

        System.out.println("Enter number of participant,k ");
        int k=keyboard.nextInt();
        int a[]=new int[k];
        for(int i=0;i<k;i++){
            System.out.println("Enter Position of k"+(i+1)+",p ");
            int p=keyboard.nextInt();
            a[i]=ShortestDistance(adj,p,dest,v);
        }
        Min(a);
       //k4,k5 both takes min moves 2.
    }

}