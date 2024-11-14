package BitManipulation;

import java.util.List;

public class FindSIngleAmongTriplets {
    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int singleNumber(final List<Integer> A) {
            int maxNo=findMaxInList(A);
            double result = Math.log(maxNo);
            long numOfBitsInMax = Math.round(result);
            int ans=0;

            for(int i=0;i<32;i++){
                int cnt=0;
                for(int j=0;j<A.size();j++){
                    if(checkBit(A.get(j),i)==true){
                        cnt++;
                    }
                }
                if(cnt%3==1){
                    ans=ans+(1<<i);
                }
            }
            return ans;
        }

        public boolean  checkBit(int N,int i){
            if(((N>>i)&1)==1){
                return true;
            }
            else{
                return false;
            }
        }

        public int findMaxInList(List<Integer> A){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<A.size();i++){
                if(A.get(i)>max){
                    max=A.get(i);
                }
            }
            return max;
        }
    }

}
