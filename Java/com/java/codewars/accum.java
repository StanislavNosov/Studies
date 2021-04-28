package com.java.study.codewars;

public class accum {
   static String doAccum(String s) {
       String[] st_Arr = s.toLowerCase().split("");
       String ans = "";
       for (int i = 0; i < st_Arr.length; i++) {
           ans += st_Arr[i].toUpperCase();
           ans += st_Arr[i].repeat(i);
           if (i < st_Arr.length-1) {
               ans += "-";
           }
       }
       return ans;
   }

    public static void main(String[] args) {
        var ans = doAccum("ZpglnRxqenU");
        System.out.println("args = " + ans);
    }
}
