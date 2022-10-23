package com.atgx.cother;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author liugx
 * @Description TODO
 * @date 2022/10/23 20:45
 **/
public class test {

    /**
     * 查找和当前模块有关系的所有模块
     * @param currentId 当前操作模块id
     * @param mustBuyModules 当前必须同时购买的模块
     * @param buyModuleDependRealMap 所有已经购买模块的集合
     * @return
     */
    private List<Long> findRealtionModules(Long currentId , List<Long> mustBuyModules,Map<Long,List<Long>> buyModuleDependRealMap){
        List<Long> result = new ArrayList<>();
        while (mustBuyModules.isEmpty()){
            mustBuyModules = buyModuleDependRealMap.get(currentId);
            result.addAll(mustBuyModules);
            for (Long realtionModule : mustBuyModules) {
                List<Long> realtion = buyModuleDependRealMap.get(realtionModule);
                findRealtionModules(realtionModule,realtion,buyModuleDependRealMap);
            }
        }
        return result;
    }

    /**
     * 构建邻接矩阵
     */
    @Test
    public void biuldDigraphByDependRealtionV2(){
        // 当前操作模块，必须同时购买的 模块
//        List<Long> realtionModule = buyModuleDependRealMap.get(curMaterialId);
        // 所有有关联的模块
//        Set<Long> allMoudleIds = buyModuleDependRealMap.keySet();
        Map<Long, List<Long>> buyModuleDependRealMap = new HashMap<>();
        Graph2 graph = new Graph2(3);
//        Long[] vertexValue = (Long[]) allMoudleIds.toArray();
        Long[] vertexValue = new Long[]{10L,20L,30L};
        // 建立各顶点所对应的值
        for (Long vertex : vertexValue) {
            graph.insertVertexList(vertex);
        }
        List<Long> allMoudleIdList = new ArrayList<>();
        allMoudleIdList.add(10L);
        allMoudleIdList.add(20L);
        allMoudleIdList.add(30L);
        buyModuleDependRealMap.put(10L, Arrays.asList(20L));
        buyModuleDependRealMap.put(20L,Arrays.asList(30L));
        buyModuleDependRealMap.put(30L,Arrays.asList(10L));
        // 添加边
        for (int i = 0; i < allMoudleIdList.size(); i++) {
            Long moduleId = allMoudleIdList.get(i);
            List<Long> realtionModules = buyModuleDependRealMap.get(moduleId);
            for (int j = 0; j < allMoudleIdList.size(); j++) {
                if(i == j){
                    continue;
                }
                int tmpi = 0;
                Long neighborModuleId = allMoudleIdList.get(j);
                List<Long> neighborRealtionModules = buyModuleDependRealMap.get(moduleId);
                if(realtionModules.contains(neighborModuleId)){
                    tmpi = 1;
                }
                graph.insertEdge(i,j,tmpi);
            }
        }
        graph.showGraph();
        //测试一把，我们的dfs遍历是否ok
//        System.out.println("深度遍历");

//        graph.dfs();
//        System.out.println("hahaha");
//        graph.findCycle(1);
        List<Long> reslut = graph.find();
        for (Long string : reslut) {
            System.out.println(string);
        }
    }

}
