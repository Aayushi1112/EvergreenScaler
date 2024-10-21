package Arrrays1D;

import java.util.Scanner;

public class ArrayPrintInReverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            System.out.println("hi");

        }
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
