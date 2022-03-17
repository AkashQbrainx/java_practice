package examples;

import java.util.HashMap;

public class Occurence {
    public static void main(String[] args) {

        String str="aakash";
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();
        for(char element:ch){
            if(map.containsKey(element)){
             map.put(element,map.get(element)+1);
            }
            else
            {
                map.put(element,1);
            }
        }
        System.out.println(map);
    }
}
