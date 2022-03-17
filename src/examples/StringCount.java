package examples;

import java.util.HashMap;

public class StringCount {

    public static void main(String[] args) {

        String str = "Hello this is aakash how is your teddy";
    String[] arr=str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+ 1);
            }
                else
                    map.put(arr[i],1);
            }
        System.out.println(map);


    }
    }

