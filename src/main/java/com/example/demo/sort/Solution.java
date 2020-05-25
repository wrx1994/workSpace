package com.example.demo.sort;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        //表示向前进一位
        int pre=0;

        while(num1.length()!=num2.length()){
            if(num1.length()>num2.length())
                num2="0"+num2;
            else
                num1="0"+num1;
        }
        for(int i=num1.length()-1;i>=0;i--){
            int m=Integer.parseInt(num1.charAt(i) +"");
            int n=Integer.parseInt(num2.charAt(i) +"");
            int temp=m+n+pre;
            if(temp>=10){
                sb.append(temp-10);
                pre=1;
            }
            else{
                sb.append(temp);
                pre=0;
            }
        }
        if(pre==1)
            sb.append('1');
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("525","525"));
    }
}


