package PrefixSum;

public class IndexRemovalOddSumequalToEvenSum {
    public int solve(int[] A) {
        int n=A.length;
        int[] evenPrefix=findEvenPrefixSum(A);
        int[] oddPrefix=findOddPrefixSum(A);
        int count=0;
        for(int i=0;i<A.length;i++){
            if(i==0){
                int oddSum=evenPrefix[n-1]-evenPrefix[0];
                int evenSum=oddPrefix[n-1]-oddPrefix[0];
                if(oddSum==evenSum){
                    count++;
                }
            }

            else{
                int oddSum=oddPrefix[i-1]+evenPrefix[n-1]-evenPrefix[i];
                int evenSum=evenPrefix[i-1]+oddPrefix[n-1]-oddPrefix[i];

                if(oddSum==evenSum){
                    count++;
                }
            }
        }
        return count;
    }

    public static int[]  findEvenPrefixSum(int[] A){
        int[] pfEven=new int[A.length];
        pfEven[0]=A[0];
        for(int i=1;i<A.length;i++){
            if(i%2==0){
                pfEven[i]=A[i]+pfEven[i-1];
            }
            else
                pfEven[i]=pfEven[i-1]+0;
        }
        return pfEven;

    }
    public static int[] findOddPrefixSum(int[] A){
        int[] pfOdd=new int[A.length];
        pfOdd[0]=0;
        for(int i=1;i<A.length;i++){
            if(i%2==1){
                pfOdd[i]=A[i]+pfOdd[i-1];
            }
            else
                pfOdd[i]=pfOdd[i-1]+0;
        }

        return pfOdd;

    }

    public static void main(String args[]){
        int[] A={10,20,30,10,20,60};
        int[] evenPf=findEvenPrefixSum(A);
        int[] oddPf=findOddPrefixSum(A);
        System.out.println("printing the even prefix sum");
        for (int i:evenPf)
        {System.out.print(i+"|");}
        System.out.println();

        System.out.println("printing the odd prefix sum");
        for (int i:oddPf)
        {System.out.print(i+"|");}











    }

}
