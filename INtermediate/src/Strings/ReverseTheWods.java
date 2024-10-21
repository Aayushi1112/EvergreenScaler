package Strings;
/**
 * Problem Description
 *
 * You are given a string A of size N.
 *
 *
 * Return the string A after reversing the string word by word.
 *
 * NOTE:
 *
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 *
 * Input 1:
 * A = "the sky is blue"
 *
 *
 * Output 1:
 * "blue is sky the"
 *
 *
 * */

public class ReverseTheWods {

    public static String solve(String A)
    {
        StringBuilder ans=new StringBuilder();
        int n=A.length();
        for(int i=n-1;i>=0;i--){
            if(A.charAt(i)!=' '){
                String current="";
                while(i>=0 && A.charAt(i)!=' '){
                    current+=A.charAt(i);
                    i--;
                }

                current= reverse(current);

            if (ans.length() > 0) {
                ans.append(" ");
                ans.append(current);
            }
                else {
                    ans.append(current);
                }
            }

        }
        return ans.toString();

    }

    private static String reverse(String current) {
        char[] s=current.toCharArray();
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


    public static void main(String args[]){
        String s="The sky is blue";
        System.out.println(solve(s));
    }
    }
