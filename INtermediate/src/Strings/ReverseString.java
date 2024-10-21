package Strings;

public class ReverseString {
    public String solve(String A) {
        char[] s=A.toCharArray();
        int start=0;
        int end=s.length-1;

        while(start<=end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }

        return new String(s);

    }
}
