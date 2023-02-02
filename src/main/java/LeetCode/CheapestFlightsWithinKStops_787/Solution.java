package LeetCode.CheapestFlightsWithinKStops_787;

class Solution {
    public int price = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        price = Integer.MAX_VALUE;
        boolean[] visited = new boolean[n];
        helper(n, flights, src, dst, k+1, 0, visited);
        return price == Integer.MAX_VALUE ? -1 : price;
    }

    public void helper(int n, int[][] flights, int src, int dst, int k, int current_cost, boolean[] visited) {
        if (current_cost > price || k < 0) {
            return;
        }
        if (src == dst) {
            price = current_cost;
            return;
        }
        visited[src] = true;
        for (int[] path : flights) {
            if (path[0] == src && !visited[path[1]]) {
                helper(n, flights, path[1], dst, k - 1, current_cost + path[2], visited);
            }
        }
        visited[src] = false;
    }
}

