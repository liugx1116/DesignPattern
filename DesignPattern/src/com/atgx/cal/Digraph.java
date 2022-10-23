//package com.atgx.cal;
//
///**
// * @author liugx
// * @Description TODO
// * @date 2022/10/23 15:17
// **/
//public class Digraph {
//    //顶点数
//    private  int V;
//    //边数
//    private int E;
//    //邻接点背包数组
//    private Bag<Integer>[] adj;
//
//    public Digraph(int V) {
//        this.V=V;
//        this.E=0;
//        adj=(Bag<Integer>[])new Bag[V];
//        for(int i=0;i<V;i++)
//            adj[i]=new Bag<Integer>();
//    }
//
//    public int V(){
//        return V();
//    }
//
//    public int E(){
//        return E;
//    }
//
//    public void addEdge(int v,int w){
//        adj[v].add(w);
//        E++;
//    }
//
//    public Iterable<Integer> adj(int v){
//        return adj[v];
//    }
//
//    /**
//     * @Author haien
//     * @Description 将图中所有边的方向逆转
//     * @Date 2018/12/4
//     * @Param []
//     * @return void
//     **/
//    public Digraph reverse(){
//        Digraph R=new Digraph(V);
//        for(int v=0;v<V;v++){
//            for(int w:adj[v])
//                R.addEdge(w,v);
//        }
//        return R;
//    }
//}
