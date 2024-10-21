package Strings;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String A) {

        String oddLen=findOddLengthLongest(A);
        String evenLen=findEvenLengthLongest(A);

        if(oddLen.length()>evenLen.length()){
            return oddLen;
        }
        else{
            return evenLen;
        }}

    private static String findOddLengthLongest(String a) {
        int n=a.length();
        StringBuilder sb=new StringBuilder();
        int ans=0;
        for(int i=0;i<n;i++) {
            int s = i;
            int e = i;
            while (s >= 0 && e <= n - 1 && a.charAt(s) == a.charAt(e)) {
                s--;
                e++;
            }
            if (e - s - 1>ans) {
                ans = e - s - 1;
                sb=new StringBuilder();
                for(int j=s + 1;j <=e - 1;j++){
                      sb.append(a.charAt(j));
                }
            }
        }
        return sb.toString();
    }

    private static String findEvenLengthLongest(String a) {
        int n=a.length();
        StringBuilder sb=new StringBuilder();
        int ans=0;
        for(int i=0;i<n;i++) {
            int s = i;
            int e = i+1;
            while (s >= 0 && e <= n - 1 && a.charAt(s) == a.charAt(e)) {
                s--;
                e++;
            }
            if (e - s - 1>ans) {
                ans = e - s - 1;
                sb=new StringBuilder();
                for(int j=s + 1;j <=e - 1;j++){
                    sb.append(a.charAt(j));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
       System.out.println( longestPalindrome("abcaabbaajkl"));

    }
}
