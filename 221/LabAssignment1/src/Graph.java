import java.util.*;
public class Graph {

        private int V;

        private ArrayList<ArrayList<Integer>> adj;

        Graph(int v) //no of vertex
        {
            V = v;
            adj = new ArrayList<ArrayList<Integer>>(v);
            for (int i=0; i<v; i++)
                adj.add(new ArrayList<Integer>());
        }

        void addEdge(int v,int w) {  //enter value or connection of each vertex
            adj.get(v).add(w);
        }

        void topologicalSortUtil(
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
                    topologicalSortUtil(i, visited, stack);
            }
            stack.push(new Integer(v));
        }
        void topologicalSort()
        {
            Stack<Integer> stack = new Stack<Integer>();
            // Mark all the vertices as not visited
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++)
                visited[i] = false;
            for (int i = 0; i < V; i++)
                if (visited[i] == false)
                    topologicalSortUtil(i, visited, stack);

            while (stack.empty()==false) {
                System.out.print(stack.pop() + " ");
                break;
            }
        }

        public static void main(String args[])
        {
            Graph g = new Graph(7);
            g.addEdge(0,6);
            g.addEdge(1, 2);
            g.addEdge(1, 5);
            g.addEdge(2, 0);
            g.addEdge(2, 5);
            g.addEdge(3, 4);
            g.addEdge(4,2);
            g.addEdge(3,1);
            System.out.println(
                    "Suitable First Number is ");
            g.topologicalSort();
        }
}
