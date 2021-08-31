import java.util.*;
public class L4 {

    private static void addEdge(ArrayList<ArrayList<Integer>>adj,int v,int w) {
        adj.get(v).add(w);
    }

    static void topologicalSortUtil(ArrayList<ArrayList<Integer>>adj,
            int v, boolean visited[],
            Stack<Integer> stack)
    {
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(adj,i, visited, stack);
        }
        stack.push(new Integer(v));
    }
    static void topologicalSort(ArrayList<ArrayList<Integer>>adj,int V)
    {
        Stack<Integer> stack = new Stack<Integer>();
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(adj,i, visited, stack);

        while (stack.empty()==false) {
            System.out.print(stack.pop() + " ");
            break;
        }
    }

    public static void main(String args[])
    {
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter number of vertices, v: ");
        int V=keyboard.nextInt();

        System.out.println("Enter number of connections,m: ");
        int m=keyboard.nextInt();

        ArrayList<ArrayList<Integer>>adj= new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<m;i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0, 6);
        addEdge(adj,1, 2);
        addEdge(adj,1, 5);
        addEdge(adj,2, 0);
        addEdge(adj,2, 5);
        addEdge(adj,3, 4);
        addEdge(adj,4, 2);
        addEdge(adj,3, 1);
        System.out.println(
                "Suitable First position is ");
        topologicalSort(adj,V);
    }
}
