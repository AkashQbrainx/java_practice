package examples;



public class Pair {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 1, 2, 3, 5, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length ; j++)
                if (a[i] == a[j]) {
                    count = j - i;
                    max = Math.max(max, count);
                }
        }
            System.out.println(max);


    }
}


    //1,2,3,4,1,2,,3,5,1-9
//1,2,3,4,2-4


