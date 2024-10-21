package BasicDSA;
import java.lang.*;
import java.util.*;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        /**
        Approach is first check
        if (a>b)
        {
        yes a>b and b is smaller than a
        }
          -- go in left with only c
            if (a>c) {->print a is greatest (because a was >b and also now >c)}
          else{
          since b<a and also we saw a<c so transitively b<c
          thus print c is greatest
         }
         else {
         means b<a
         thus check if (b>c)
         print bis greatest
         else
         if a<b and b<c  so transitively a<c
         then definitely c i s the largest beacause a was already less than b
         and now b is also less than c

         }
         **/
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
