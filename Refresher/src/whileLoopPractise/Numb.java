package whileLoopPractise;
import java.util.Scanner;

public class Numb {
    public static void main(String[] args)
    {
        System.out.println("enter the count");
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int count=1;
        while(count<=t)
        {
            System.out.println("Enter the number");
            int no=scn.nextInt();
            int dcount=0;
            if(no==0){
                System.out.println(0);
            }
            else{
                while(no!=0)
                {
                    dcount++;
                    no=no/10;
                }
                System.out.println(dcount);
                count++;}
        }


    }
}
