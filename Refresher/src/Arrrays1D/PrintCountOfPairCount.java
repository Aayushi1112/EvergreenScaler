package Arrrays1D;

public class PrintCountOfPairCount
{
    public static int solve(int[] A, int B) {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j]==B){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String arg[]){
        int arr[]={1,2,3,2,1};
        int b=5;
        System.out.print(solve(arr,b));

    }
}

