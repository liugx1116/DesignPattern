//package cn.ywrby.Graph;
//
////有向图
//
//import edu.princeton.cs.algs4.Bag;
//import edu.princeton.cs.algs4.In;
//
//public class Digraph1 {
//    private final int V;  //图中顶点数目
//    private int E;   //边的个数
//    private Bag<Integer>[] adj;   //邻接表
//    //构造函数
//    public Digraph(int V){
//        this.V=V;
//        this.E=0;
//        adj=(Bag<Integer>[]) new Bag[V];
//        for(int v=0;v<V;v++){
//            adj[v]=new Bag<Integer>();
//        }
//    }
//    public int V(){return V;}
//    public int E(){return E;}
//
//    //与无向图最大区别，只向v中写入w，而在w的邻接表中不包含v
//    public void addEdge(int v,int w){
//        adj[v].add(w);  //向v的链表中写入顶点w
//        E++;  //增加边的数目
//    }
//
//    public Digraph1(In in){
//        this(in.readInt());
//        int E=in.readInt();
//        for(int i=0;i<E;i++){
//            int v=in.readInt();
//            int w=in.readInt();
//            addEdge(v,w);
//        }
//    }
//
//    public Iterable<Integer>adj(int v){return adj[v];}
//
//    //有向图特有方法，倒置所有有向路径，将图反向
//    //利用正向图可以获得某个节点都指向了哪些顶点
//    //利用反向图，可以获得有多少点指向该节点
//    public Digraph reverse(){
//        Digraph R=new Digraph(V);
//        for(int v=0;v<V;v++){
//            for (int w:adj(v)){
//                R.addEdge(w,v);
//            }
//        }
//        return R;
//    }
//}
