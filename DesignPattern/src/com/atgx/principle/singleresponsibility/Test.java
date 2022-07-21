package com.atgx.principle.singleresponsibility;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

/**
 * @author lgx
 * @date 2022/6/1415:52
 */
public class Test {

    public static void main(String[] args) {
        Map<String, Integer> budget =new HashMap<>();
        budget.put("clothes",12);
        budget.put("grocery",15);
        budget.put("transportation",10);
        budget.put("utility",13);
        budget.put("rent",115);
        budget.put("miscellneous",9);
        System.out.println("map before sorting: "+ budget);

        Map<String, Integer> sorted = budget
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(toMap(e -> e.getKey(), e -> e.getValue(),(e1, e2)-> e2, LinkedHashMap::new));
        System.out.println("map after sorting by values: "+ sorted);
    }

}
