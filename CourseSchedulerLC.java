import java.util.*;

public class CourseSchedulerLC {
    public static boolean dfs(List<List<Integer>> adj,int inStack[], int vis[], int i) {
        if(inStack[i] == 1) {
            return true;
        }
        if(vis[i] == 1) {
            return false;
        }

        inStack[i] = 1;
        vis[i] = 1;

        for(int n:adj.get(i)) {
            if(dfs(adj, inStack, vis, n)) {
                return true;
            }
        }
        inStack[i] = 0;
        return false;
        
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for(int arr[]:prerequisites) {
            adj.get(arr[0]).add(arr[1]);
        }
        int inStack[] = new int[numCourses];
        int vis[] = new int[numCourses];
        for(int i=0; i<numCourses; i++) {
            if(dfs(adj, inStack, vis, i)) {
                return false;
            }
        }
        return true;
        
    }
}
