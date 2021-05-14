package Java.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class DataReverse {

    public static int[] DataReverse(int[] data) {
        ArrayList<int []> byteList = new ArrayList();
        for (int i = 0; i < data.length; i+=Byte.SIZE) {
            byteList.add(Arrays.copyOfRange(data, i, i+Byte.SIZE));
        }
        Collections.reverse(byteList);
        return byteList.stream().flatMapToInt(ints -> Arrays.stream(ints)).toArray();
    }


    public static void main(String[] args) {
        int[] data = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        DataReverse(data);
    }
}
