package Strings;

public class ToggleCase {
    public static String solve(String A) {
        char[] str=A.toCharArray();
        int n=str.length;
        for(int i=0;i<n;i++){
            char ch=A.charAt(i);
            if(ch>='a'&& ch<='z'){
                str[i]=(char)(ch-32);
            }
            else{
                str[i]=(char)(ch+32);
            }
        }
        return str.toString();
    }
    public static void main(String args[]){
        String s="CAmelCase";
        String ans=solve(s);
        System.out.println(ans);

    }

}
