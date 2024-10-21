package Arrrays1D;

public class ConsecutiveDuplicates {
    public static boolean solve(int arr[]) {
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,5};
        //here there are consecutive 55 so it will give true.
        System.out.println(solve(arr));

    }
}
