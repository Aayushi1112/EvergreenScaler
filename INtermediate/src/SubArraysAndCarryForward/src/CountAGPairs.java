public class CountAGPairs {

        public static long solve(String A) {
            long ans=0;
            long cntG=0;
            for(int i=A.length()-1;i>=0;i--){
                if(A.charAt(i)=='G'){
                    cntG++;
                }
                else if(A.charAt(i)=='A'){
                    ans=ans+cntG;
                }
            }
            return ans;
        }


        public static void main(String args[]){
            String s="AABSDFHJGGAIIGG";
            long ans=solve(s);
        }
    }


