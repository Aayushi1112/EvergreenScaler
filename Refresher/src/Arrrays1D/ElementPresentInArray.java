package Arrrays1D;

import java.util.Scanner;

public class ElementPresentInArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int testcount=1;
        while(testcount<=t){

            int n=scn.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();}
            int b=scn.nextInt();

            boolean flag=false;
            for(int i=0;i<n;i++){

                if(arr[i]==b){
                    flag=true;
                    break;
                }


            }
            if(flag==true){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
            testcount++;
        }

    }
}
