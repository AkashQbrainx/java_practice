package examples;

import java.util.ArrayList;

public class sample2 {
    public static void main(String[] args) {

        String str="hai iam hai iam aakash is funny";
        String[] arr=str.split(" ");
        ArrayList<String> a=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
int count=0;
            if(!a.contains(arr[i])){
                a.add(arr[i]);
            for(int j = i; j<arr.length; j++){
                if(arr[i].equals(arr[j]) )count++;
            }
                System.out.println(arr[i]+ "-> "+count);
        }

        }
    }
}
