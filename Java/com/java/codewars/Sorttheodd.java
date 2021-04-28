package com.java.codewars;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Sorttheodd {
    public static int[] sortArray(int[] array) {
        int[] odd = IntStream.of(array)
                .filter(a -> a%2!=0)
                .sorted().toArray();
        int[] index = new int[array.length - odd.length];
        for (int i = 0, x = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                index[x]=i;
                x+=1;
            }
        }
        List<Integer> arrayList = new ArrayList();
        for (int i = 0,x = 0, o = 0; i < array.length; i++) {
            if (array[i]%2!=0) {
                arrayList.add(odd[o]);
                o+=1;
                continue;
            }
            arrayList.add(array[index[x]]);
            x+=1;
            //System.out.print(k);
        }
        int [] ans = arrayList.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] testInt =  {5, 3, 2, 8, 1, 4 };
        System.out.println(sortArray(testInt));
    }
}
