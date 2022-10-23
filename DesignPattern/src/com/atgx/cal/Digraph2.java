//package com.atgx.cal;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Stack;
//
///**
// * @author liugx
// * @Description TODO
// * @date 2022/10/23 19:37
// **/
//public class Digraph2 {
//    private final int vertices;
//    private int edges;
//    private List<LinkedList<Integer>> adj;
//
//    public Digraph2(int vertices) {
//        if(vertices < 0) throw new IllegalArgumentException(
//                "Number of vertices in a Digraph must be nonnegative");
//        this.vertices = vertices;
//        this.edges = 0;
//        adj = new ArrayList<LinkedList<Integer>>();
//        for(int i = 0; i < vertices; i++) {
//            adj.add(new LinkedList<Integer>());
//        }
//    }
//
//    public void addEdge(int v, int w) {
//        if(v < 0 || v >= vertices)
//            throw new IndexOutOfBoundsException(
//                    "vertex " + v + " not in bound.");
//        if(w < 0 || w >= vertices)
//            throw new IndexOutOfBoundsException(
//                    "vertex " + w + " not in bound.");
//        adj.get(v).add(w);
//        edges++;
//    }
//}
//
//public class DirectedCycle {
//    private boolean[] marked;
//    private int[] edgeTo;
//    private Stack<Integer> cycle;
//    private boolean[] onStack;
//
//    public DirectedCycle(Digraph2 g) {
//        onStack = new boolean[g.getVertices()];
//        edgeTo = new int[g.getVertices()];
//        marked = new boolean[g.getVertices()];
//        for(int v = 0; v < g.getVertices(); v++) {
//            if(!marked[v]) dfs(g, v);
//        }
//    }
//
//    private void dfs(Digraph2 g, int v) {
//        onStack[v] = true;
//        marked[v] = true;
//        for(int w : g.adj(v)) {
//            if(hasCycle()) return;
//            if(!marked[w]) {
//                edgeTo[w] = v;
//                dfs(g, w);
//            } else if(onStack[w]) {
//                cycle = new Stack<Integer>();
//                for(int x = v; x != w; x = edgeTo[x])
//                    cycle.push(x);
//                cycle.push(w);
//                cycle.push(v);
//            }
//        }
//        onStack[v] = false;
//    }
//｝