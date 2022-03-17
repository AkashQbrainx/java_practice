package examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 8, 3, 5, 6, 2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.remove(arr[i]);
            } else
                map.put(arr[i], i);
        }
        System.out.println(map.keySet());
}
}
