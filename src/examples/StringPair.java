package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class StringPair {

    public static void main(String[] args) {

        char[] ch={'x','y','z'};
        ArrayList<StringBuffer> arr=new ArrayList<>();

        for(int i=0;i<ch.length;i++){
                StringBuffer s=new StringBuffer();
                s.append(ch[i]);
            for(int j=0;j<ch.length;j++){
                if(i!=j)
               s.append(ch[j]);
            }
            arr.add(s);
            StringBuffer s1=new StringBuffer();
            s1.append(ch[i]);
            for(int k=ch.length-1;k>=0;k--){
                if(i!=k) {
                    s1.append(ch[k]);
                }
            }
            arr.add(s1);
        }
        System.out.println(arr);
    }
}
