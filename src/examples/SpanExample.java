package examples;

import java.util.HashMap;

public class SpanExample {

    public static void main(String[] args) {


        int[] arr={1,2,3,4,5,1,2,3,1};

        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                System.out.println(map);
                max=Math.max(max,i-map.get(arr[i]+1));
                System.out.println(max);
            }
            else
            {
                map.put(arr[i],i);
                System.out.println(map);
            }
        }
        System.out.println(max);
    }
}
