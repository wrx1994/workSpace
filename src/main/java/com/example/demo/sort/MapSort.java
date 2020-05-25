package com.example.demo.sort;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSort {
    /**
     * 遍历map
     */
    public Map getMap(){
        Map map = new HashMap();
        map.put( 1, "Jacky");
        map.put( 2, "Lucy");
        map.put( 3, "Tom");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            if(entry.getKey().equals(1)){
                System.out.println(entry.getValue());
             //   it.remove();
            }
        }
        return map;
    }

        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }


    public static void main(String[] args) {
        MapSort sort = new MapSort();
        int[] nums = {3,6,11,15};
        System.out.println(Arrays.toString(sort.twoSum(nums,9)));
        Integer a = new Integer(100);
        Integer c = 100;
        int b = 100;
        System.out.println(a==b);
        System.out.println(a==c);
    }
}
