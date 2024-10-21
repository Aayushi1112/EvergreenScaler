package Arrrays1D;

public class FrequencyOfAnElementInArray {



        public static int solve(int[] A, int B) {
            int n=A.length;
            int count=0;
            for(int i=0;i<n;i++){
                if(A[i]==B)
                {
                    count++;
                }
            }
            return count;
        }

        public static void main(String args[]){
            int arr[]={10,10,10,20,40,30,10};
            int b=100;
            System.out.print(solve(arr,b));

        }
    }


