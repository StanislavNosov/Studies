package com.java.codewars;

import java.util.HashSet;
import java.util.Locale;

public class PangramCheck {
    public static boolean check(String sentence){
        String inputStr = sentence.toLowerCase(Locale.ROOT).replaceAll("\\W","");
        char[] arr = inputStr.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char ch: arr) {
            set.add(ch);
        }
        if (set.size()==26) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check("olrzpxiuqidbsnaemjvm xrtpkkhgi gficibuwf yh."));
    }
}
