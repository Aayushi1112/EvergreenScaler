package Arrrays1D;

/**
Given an array A, check if it is sorted in non-decreasing order or not.

Non-decreasing order means that the numbers in a sequence can stay the same or increase, but they cannot decrease.
 Example:[1,2,2,9]
 wrong:[1,2,1]-->1 after 2 should not be there
 **/
public class ArrayInNonDecreasingOrder {
    public static int solve(int[] A) {
        int n=A.length;

        for(int i=1;i<n;i++){
            if(A[i]<A[i-1]){
                return 0;
            }

        }
        return 1;
    }
    public static void main(String args[]){
        int arr1[]={1,2,2,5,6,8};
        int arr2[]={1,5,6,2,3};
        System.out.print(solve(arr1));
        System.out.print(solve(arr2));
        //here 1 means yes it is in ascending order and 0 means not
    }
}
