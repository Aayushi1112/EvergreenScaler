package PrefixSum;



public class PrefixSumArray {
    public static void main(String args[]) {
        int[] A = {10, 20, 30, 40};

        int[] Pf = findPrefixSum(A);
        for (int i:Pf
             ) {
            System.out.print(i+"|");


        }


    }

    private static int[] findPrefixSum(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            a[i]=a[i]+a[i-1];

        }
        return a;

    }
}
