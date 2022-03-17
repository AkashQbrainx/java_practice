package examples;

public class STRING {

    public static void main(String[] args) {

        String s1="aakash";
        String s2="aakash";
        String s3=new String("aakash");
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);

        StringBuffer s=new StringBuffer("aaksj");
        System.out.println(s.append("sss").append("akjak"));

    }
}

