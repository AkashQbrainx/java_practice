package examples;

import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(6);
        arr.add(22);
        arr.add(44);
        arr.add(55);
        arr.add(66);
        arr.add(77);
        System.out.println(arr);
        arr.add(3,88);
        System.out.println(arr);
    for(int i :arr) {
        System.out.println(i);
    }
       arr.remove(3);
        System.out.println(arr);
    }
}
