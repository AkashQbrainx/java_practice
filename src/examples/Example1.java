package examples;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

   //     System.out.println("emter the number");
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        System.out.println(a);
//        int b=sc.nextInt();
        System.out.println("enter the num");
        int st=sc.nextInt();
        System.out.println(st);
        System.out.println("enter string");
        String str=sc.nextLine();
        System.out.println(str);
        System.out.println(str.charAt(9));
    }
}
