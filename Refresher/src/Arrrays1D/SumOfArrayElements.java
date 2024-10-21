package Arrrays1D;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            sum=sum+arr[i];
        }

        System.out.print(sum);


    }
}
