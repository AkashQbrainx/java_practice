package examples;

public class PairNum {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,4,5,6,6,78};

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            int firstPairSum=temp;

            for (int j = i+2; j <arr.length; j=j+2) {
                firstPairSum = firstPairSum + arr[j];
            }
            max=Math.max(firstPairSum,max);

            int secondPairMax=temp;

            for(int k=i+2;k<arr.length;k++){
                int  secondpairSum=temp+arr[k];
                secondPairMax=Math.max(secondPairMax,secondpairSum);
            }

            max=Math.max(secondPairMax,max);
        }
        System.out.println(max);
    }
}
