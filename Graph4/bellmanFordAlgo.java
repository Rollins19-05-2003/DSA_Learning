package Graph4;

import java.util.*;

public class bellmanFordAlgo {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    static void createGraphNew(ArrayList<Edge> graph) {
        
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFordNew(ArrayList<Edge> graph, int src, int V) {
        // O(V*E)
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        // algo --> O(V)
        for (int i = 0; i < V - 1; i++) {
            // finding edges --> O(E)
            for (int j = 0; j < graph.size(); j++) {

                Edge e = graph.get(j);
                int u = e.src;
                int v = e.dest;
                int w = e.weight;
                // relaxation
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }

        }

        for (int j = 0; j < dist.length; j++) {
            System.out.print(dist[j] + " ");
        }
        System.out.println();
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        // O(V*E)
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        // algo --> O(V)
        for (int i = 0; i < V - 1; i++) {
            // finding edges --> O(E)
            for (int j = 0; j < graph.length; j++) { // loop for finding vertex
                for (int k = 0; k < graph[j].size(); k++) { // edge for each vertex
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.weight;
                    // relaxation
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                    }
                }
            }
        }

        for (int j = 0; j < dist.length; j++) {
            System.out.print(dist[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        // ArrayList<Edge> graph[] = new ArrayList[V];
        // createGraph(graph);
        // bellmanFord(graph, 0);
        ArrayList<Edge> edges = new ArrayList<>();
        createGraphNew(edges);
        bellmanFordNew(edges, 0, V);

    }
}
