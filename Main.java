import java.util.*;

class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Tuple {
    int first, second, third;
    Tuple(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Create the adjacency list to depict airports and flights in the form of the graph
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for (int i = 0; i < m; i++) {
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }

        // Queue to perform BFS
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0, src, 0));

        // Distance array to store the updated distances from the source
        int[] dist = new int[n];
        Arrays.fill(dist, (int) 1e9);
        dist[src] = 0;

        // Iterate through the graph using a queue like in Dijkstra's algorithm
        while (!q.isEmpty()) {
            Tuple it = q.poll();
            int stops = it.first;
            int node = it.second;
            int cost = it.third;

            // We stop the process as soon as the limit for the stop reaches
            if (stops > k) continue;
            for (Pair iter : adj.get(node)) {
                int adjNode = iter.first;
                int edW = iter.second;

                // We only update the queue if the new calculated dist is less than the previous and the stops are also within limits
                if (cost + edW < dist[adjNode] && stops <= k) {
                    dist[adjNode] = cost + edW;
                    q.add(new Tuple(stops + 1, adjNode, cost + edW));
                }
            }
        }
        return dist[dst] == (int) 1e9 ? -1 : dist[dst];
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 4, src = 0, dst = 3, k = 1;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};

        Solution obj = new Solution();
        int ans = obj.findCheapestPrice(n, flights, src, dst, k);

        System.out.print(ans);
        System.out.println();
    }
}
