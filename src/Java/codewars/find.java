package Java.codewars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class find {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0]==arr[1]?arr[arr.length-1]:arr[0];
    }

    public static void main(String[] args) {
        System.out.print(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }
}
