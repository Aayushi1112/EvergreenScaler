package Strings;

public class ReverseStringWordByWordAndRemoveSpaces {
    public static String solve(String A) {
        StringBuilder sb=new StringBuilder();
        int n=A.length();
        int start = 0;
        int end = n - 1;

        while (start < n && A.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && A.charAt(end) == ' ') {
            end--;
        }

        for(int i=end;i>=start;i--){
            if(A.charAt(i)!=' '){
                sb.append(A.charAt(i));
            }

            else if(A.charAt(i)==' '){
                if(A.charAt(i+1)!=' '){
                    sb.append(' ');
                }
            }
        }

        return sb.toString();

    }

    public static void main(String args[]){
        String s="the sky is blue";
        String res=solve(s);
        System.out.println(res);
    }
}
