package Arrrays1D;

import java.util.Scanner;

public class PrintEvenAndOddInSEprateLines {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int t=scn.nextInt();
        for(int k=0;k<=t;k++)
        {
            System.out.println("Enter number of elementsin array");
            int n=scn.nextInt();
            int a[]=new int[n];
            int evenCount=0;
            int oddCount=0;
            System.out.println("Enter Array elements");
            for(int i=0;i<n;i++){
                a[i]=scn.nextInt();

                if(a[i]%2==0)
                {
                    evenCount++;
                }
                else
                    oddCount++;
            }

            int evenArr[]=new int[evenCount];
            int oddArr[]=new int[oddCount];
            int e=0;
            int o=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]%2==0){

                    evenArr[e]=a[i];
                    e++;
                }
                else{
                    oddArr[o]=a[i];
                    o++;
                }
            }

            System.out.println("Printing arrays");
            for(int i=0;i<evenCount;i++){
                System.out.print(evenArr[i]+" ");
            }
            System.out.println();
            for(int i=0;i<oddCount;i++){
                System.out.print(oddArr[i]+" ");
            }



        }
    }

}
