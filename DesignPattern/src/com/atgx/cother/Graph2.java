package com.atgx.cother;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liugx
 * @Description TODO
 * @date 2022/10/23 20:44
 **/
public class Graph2 {
    //存储顶点集合
    private ArrayList<Long> vertexList;
    //存储图对应的邻结矩阵
    private int[][]edges;
    //表示边的数目
    private int numOfEdges;
    //定义给数组boolean[], 记录某个结点是否被访问
    private boolean[] isVisited;
    //从出发节点到当前节点的轨迹
    private ArrayList<Integer> trace = new ArrayList<Integer>();
    private int[] visited;//节点状态,值为0的是未访问的
    private boolean hasCycle = false;
    //构造器
    public Graph2(int n) {
        //初始化矩阵和vertexList
        edges = new int[n][n];
        visited = new int[n];
        vertexList = new ArrayList<Long>(n);
        numOfEdges = 0;
    }
    /**
     * 功能描述:插入节点
     * @Param: [vertex]
     * @Return: void
     * @Author: liugx
     * @Date: 2022/10/23 17:11
     */
    public void insertVertexList(Long vertex){
        vertexList.add(vertex);
    }
    /**
     * 功能描述: 插入边
     * v1表示点的下标 第几个顶点  "A"-"B" "A"->0 "B"->1
     * v2 第二个顶点对应的下标
     * 注意： 这里有顺序，如果是 A——》B  第一个是 a  第二个是b
     * weight 表示 权值
     * @Param: []
     * @Return: void
     * @Author: liugx
     * @Date: 2022/10/23 17:12
     */
    public void insertEdge(int v1 ,int v2 , int weight){
        edges[v1][v2] = weight;
        numOfEdges++;
    }


    void findCycle(int v)   //递归DFS
    {
        if (visited[v] == 1) {
            int j;
            if ((j = trace.indexOf(v)) != -1) {
                hasCycle = true;
                System.out.print("Cycle:");
                while (j < trace.size()) {
                    System.out.print(trace.get(j) + " ");
                    j++;
                }
                System.out.print("\n");
                return;
            }
            return;
        }
        visited[v] = 1;
        trace.add(v);
        for (int i = 0; i < vertexList.size(); i++) {
            if (edges[v][i] == 1) findCycle(i);
        }
        trace.remove(trace.size() - 1);
    }

    public boolean getHasCycle() {
        return hasCycle;
    }


    /**
     * @Title find
     * @Description 寻找闭环
     * @date 2018年5月17日
     * @return
     */
    public  List<Long> find() {
        // 从出发节点到当前节点的轨迹
        List<Integer> trace =new ArrayList<Integer>();
        //返回值
        List<Long> reslut = new ArrayList<>();
        if(edges.length>0) {
            findCycle(0, trace,reslut);
        }
        if(reslut.size()==0) {
//            reslut.add("no cycle!");
        }
        return reslut;
    }
    /**
     * @Title findCycle
     * @Description dfs
     * @date 2018年5月17日
     * @param v
     * @param trace
     * @param reslut
     */
    private  void findCycle(int v,List<Integer> trace,List<Long> reslut)
    {
        int j;
        //添加闭环信息
        if((j=trace.indexOf(v))!=-1) {
            StringBuffer sb = new StringBuffer();
            Long startNode = vertexList.get(trace.get(j));
            while(j<trace.size()) {
                reslut.add(vertexList.get(trace.get(j)));
//                sb.append(vertexList.get(trace.get(j))+"-");
                j++;
            }
            reslut.add(startNode);
            return;
        }
        trace.add(v);
        for(int i=0;i<vertexList.size();i++){
            if(edges[v][i]==1) {
                findCycle(i,trace,reslut);
            }
        }
        trace.remove(trace.size()-1);
    }


    //深度优先遍历算法
    //i 第一次就是 0
    private void dfs(boolean[] isVisited, int i) {
        // 从出发节点到当前节点的轨迹
        List<Integer> trace =new ArrayList<Integer>();
        //首先我们访问该结点,输出
        System.out.print(getValueByIndex(i) + "->");
        //将结点设置为已经访问
        isVisited[i] = true;
        //查找结点i的第一个邻接结点w
        int w = getFirstNeighbor(i);
        while(w != -1) {//说明有
            if(!isVisited[w]) {
                dfs(isVisited, w);
            }
            //如果w结点已经被访问过
            w = getNextNeighbor(i, w);
        }

    }
    //对dfs 进行一个重载, 遍历我们所有的结点，并进行 dfs
    public void dfs() {

        isVisited = new boolean[vertexList.size()];
        //遍历所有的结点，进行dfs[回溯]
        for(int i = 0; i < getNumOfVertex(); i++) {
            if(!isVisited[i]) {
                dfs(isVisited, i);
            }
        }
    }

    //图中常用的方法
    //返回结点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }
    //得到第一个邻接结点的下标 w
    /**
     *
     * @param index
     * @return 如果存在就返回对应的下标，否则返回-1
     */
    public int getFirstNeighbor(int index) {
        for(int j = 0; j < vertexList.size(); j++) {
            if(edges[index][j] > 0) {
                return j;
            }
        }
        return -1;
    }
    //根据前一个邻接结点的下标来获取下一个邻接结点
    public int getNextNeighbor(int v1, int v2) {
        for(int j = v2 + 1; j < vertexList.size(); j++) {
            if(edges[v1][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    // TODO  备用
    //显示图对应的矩阵
    public void showGraph() {
        for(int[] link : edges) {
            System.err.println(Arrays.toString(link));
        }
    }

    //得到边的数目
    public int getNumOfEdges() {
        return numOfEdges;
    }
    //返回结点i(下标)对应的数据 0->"A" 1->"B" 2->"C"
    public Long getValueByIndex(int i) {
        return vertexList.get(i);
    }
    //返回v1和v2的权值
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }
}
