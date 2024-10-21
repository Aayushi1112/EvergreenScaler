import java.util.ArrayList;

public class SmallestSubArrayHAvingMinimumAndMaximumElement {


        public int solve(ArrayList<Integer> A) {
            int min=findMin(A);
            int max=findMax(A);
            int lastMax=-1;
            int lastMin=-1;
            int ans=A.size();
            int n=A.size();
            for(int i=n-1;i>=0;i--){
                if(A.get(i)==max){
                    lastMax=i;
                    if(lastMin!=-1){
                        ans=Math.min(ans,lastMin-lastMax+1);
                    }
                }
                if(A.get(i)==min){
                    lastMin=i;
                    if(lastMax!=-1){
                        ans=Math.min(ans,lastMax-lastMin+1);
                    }
                }
            }
            return ans;
        }

        public int findMin(ArrayList<Integer> A){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<A.size();i++){
                if(A.get(i)<min){
                    min=A.get(i);
                }
            }
            return min;
        }

        public int findMax(ArrayList<Integer> A){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<A.size();i++){
                if(A.get(i)>max){
                    max=A.get(i);
                }
            }
            return max;
        }
    }


