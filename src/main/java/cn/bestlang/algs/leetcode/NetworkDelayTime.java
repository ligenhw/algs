package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NetworkDelayTime {

    private List<Edge>[] adj;

    public int networkDelayTime(int[][] times, int n, int k) {
        adj = new ArrayList[n];
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];
            if (adj[u] == null) {
                adj[u] = new ArrayList<>();
            }
            adj[u].add(new Edge(v, w));
        }

        //TODO

        return 0;
    }

    static class Edge {
        int v;
        int w;

        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}
