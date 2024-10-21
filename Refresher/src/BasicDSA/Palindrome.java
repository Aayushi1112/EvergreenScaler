package BasicDSA;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int no=1000001;
        int rev=0;
        int d=0;
        while(no>0)
        {
            d=no%10;
            if(d==0){
                rev=rev*10*10;
            }
            else{
            rev=rev*10+d;}
            no=no/10;

        }
        if(rev==no){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
