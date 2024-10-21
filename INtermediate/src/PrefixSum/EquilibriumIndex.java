package PrefixSum;

/**
 * You are given an array A of integers of size N.
 *
 * Your task is to find the equilibrium index of the given array
 *
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 *
 * If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
 *
 * Note:
 *
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 105
 * -105 <= A[i] <= 105
 *
 *
 * Input Format
 *
 * First arugment is an array A .
 *
 *
 * Output Format
 *
 * Return the equilibrium index of the given array. If no such index is found then return -1.
 *
 *
 * Example Input
 *
 * Input 1:
 * A = [-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 *
 * A = [1, 2, 3]
 *
 *
 * Example Output
 *
 * Output 1:
 * 3
 * Output 2:
 *
 * -1*/
public class EquilibriumIndex {

    public static int solve(int[] A) {
        long[] pfA = findPrefixA(A);
        int n = A.length;
        if (n == 1) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            long leftSum = pfA[i - 1];
            long rightSum = pfA[n - 1] - pfA[i];
            if (leftSum == rightSum) {
                return i;
            }
        }


        return -1;
    }

    public static long[] findPrefixA(int[] A) {
        long[] pfA=new long[A.length];
        pfA[0]=A[0];
        for (int i = 1; i < A.length; i++) {
            pfA[i] = A[i] + pfA[i - 1];
        }
        return pfA;
    }

    public static void main(String args[]) {
        int[] A = {1,2,3,7,1,2,3};
      //  int[] pf = findPrefixA(A);
        int ans=solve(A);
        System.out.println(ans);
    }
}