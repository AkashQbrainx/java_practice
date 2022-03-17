package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCount {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 1, 2, 99, 4, 5, 13));
        int count = 3;
        int index = 0;
        int[] a = new int[count];

        for (int value : list) {
            if (value >= 0 && value < 10 || value >= 90 && value <= 100) {
                if (index < count) {
                    a[index] = value;
                    index = index + 1;
                }
            }
        }
            System.out.print(Arrays.toString(a));
        }
}