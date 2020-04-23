package com.example.demo.sort;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 数组
 */
public class DataSort {
    /**
     * 通过栈实现队列
     * @param node
     */
    Stack<Integer> stackOne = new Stack<>();
    Stack<Integer> stackTwo = new Stack<>();
    public void push(int node){
        stackOne.push(node);
    }
    public int pop(){
        if(stackOne.empty()&&stackTwo.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stackTwo.empty()){
            while(!stackOne.empty()){
                stackTwo.push(stackOne.pop());
            }
        }
        return stackTwo.pop();
    }

    /**
     * 简单选择排序
     * 遍历整个序列，将最小的数放在最前面。
     * 遍历剩下的序列，将最小的数放在最前面。
     * 重复第二步，直到只剩下一个数。
     * @param
     */
    public int[] showSort(int[] b) {
        for (int i = 0; i < b.length; i++) {
            int key = b[i];//最小值
            int sign = i;//最小值下标
            for (int j = i + 1; j < b.length; j++) {
                if (key > b[j]) {
                    key = b[j];//最小值的值
                    sign = j;//记录最小值下标
                }
            }
            b[sign] = b[i];//第一个值给到查到的最小值的位置
            b[i] = key;//最小值给到最前面
        }
        //奇数放在前面，偶数放在后面
        for (int i = 0; i < b.length - 1; i++) {
            int value;
            if ((b[i] & 1)==0  && (b[i + 1] & 1)==1) {
                value = b[i];
                b[i] = b[i + 1];
                b[i + 1] = value;
            }
        }
        return b;
    }

    /**
     * 统计数组中元素出现的次数
     * @return
     */
    public Map getDataNum(){
        int[] a = {1,3,2,4,2,6};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<a.length; i++){
            map.put(a[i],map.get(a[i])==null?1:map.get(a[i])+1);
        }
        return map;
    }

    public static void main(String[] args) {
        DataSort dataSort = new DataSort();
        int[] a = {45,56,23,43,1,5,8};
        System.out.print(Arrays.toString(dataSort.showSort(a)));
    }

}
