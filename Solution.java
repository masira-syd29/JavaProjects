public class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int[] aliceParent = new int[n + 1];
        int[] bobParent = new int[n + 1];
        
        // Initialize the parent arrays
        for (int i = 1; i <= n; i++) {
            aliceParent[i] = i;
            bobParent[i] = i;
        }
        
        int removedEdges = 0;
        int aliceEdges = 0;
        int bobEdges = 0;
        
        // Process type 3 edges first (shared by both Alice and Bob)
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                boolean aliceUnion = union(aliceParent, edge[1], edge[2]);
                boolean bobUnion = union(bobParent, edge[1], edge[2]);
                if (aliceUnion) aliceEdges++;
                if (bobUnion) bobEdges++;
                if (!aliceUnion && !bobUnion) removedEdges++;
            }
        }
        
        // Process type 1 edges (only Alice)
        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (union(aliceParent, edge[1], edge[2])) {
                    aliceEdges++;
                } else {
                    removedEdges++;
                }
            }
        }
        
        // Process type 2 edges (only Bob)
        for (int[] edge : edges) {
            if (edge[0] == 2) {
                if (union(bobParent, edge[1], edge[2])) {
                    bobEdges++;
                } else {
                    removedEdges++;
                }
            }
        }
        
        // Check if Alice and Bob can both traverse the entire graph
        if (aliceEdges == n - 1 && bobEdges == n - 1) {
            return removedEdges;
        } else {
            return -1;
        }
    }
    
    // Helper function to find the root parent
    private int find(int[] parent, int u) {
        if (parent[u] != u) {
            parent[u] = find(parent, parent[u]);
        }
        return parent[u];
    }
    
    // Helper function to union two sets
    private boolean union(int[] parent, int u, int v) {
        int rootU = find(parent, u);
        int rootV = find(parent, v);
        if (rootU != rootV) {
            parent[rootU] = rootV;
            return true;
        }
        return false;
    }
}
