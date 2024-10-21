package InterviewQuestions;

public class LongestStringOfOnesAfterswappingOneZero {
    public int solve(String A) {
        char[] a=A.toCharArray();
        int n=a.length;
        int ans=0;
        int noOfOnes=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]=='1'){
                noOfOnes++;
            }
        }
        if(noOfOnes==n){
            return n;
        }

        int sum=0;
        int j=0;
        int l=0;
        int r=0;

        for(int i=0;i<n;i++)
        {
            if(a[i]=='0'){
                j=i-1;
                l=0;
                while(j>=0 && a[j]=='1'){
                    l++;
                    j--;
                }

                j=i+1;
                r=0;
                while(j<n && a[j]=='1'){
                    r++;
                    j++;
                }

                sum=l+r;

                if(l+r<noOfOnes){
                    sum=l+r+1;
                }
                ans=Math.max(ans,sum);


            }
        }
        return ans;
    }
}
