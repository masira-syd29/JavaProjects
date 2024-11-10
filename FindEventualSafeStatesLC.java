import java.util.*;

public class FindEventualSafeStatesLC {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Map<Integer, Boolean> memoizationMap = new HashMap<>();

        for(int i=0; i<graph.length; i++) {
            //
            if(graph[i].length == 0) {
                memoizationMap.put(i, true);
            }
        }
        for(int i=0; i<graph.length; i++) {
            boolean result = dfs(i, graph, new HashSet<Integer>(), memoizationMap);
            memoizationMap.put(i, result);
            System.out.println("done checking node : " +i);
        }
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<graph.length; i++) {
            if(memoizationMap.get(i)) {
                list.add(i);
            }

        }
        
        return list;
    }

    private boolean dfs(int curr, int[][] graph, Set<Integer> vis, Map<Integer, Boolean> memoizationMap) {
        System.out.println("Checking : " +curr);
        if(memoizationMap.containsKey(curr)) {
            return memoizationMap.get(curr);
        }
        //if node is already visited it means multiple possible paths in that node, so will return false
        if(vis.contains(curr)) {
            return false;
        }
        vis.add(curr);
        for(int i : graph[curr]) {
            boolean flag = dfs(i, graph, vis, memoizationMap);

            if(flag) {
                memoizationMap.put(i, true);
            } else {
                return false;
            }
        }
        //backtracking
        vis.remove(curr);
        return true;
        
    }
}
