package BasicDSA;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=12;
        int b=24;
        int count=a<b?a:b;
        int factor=1;
        for(int i=1;i<=count;i++){
            if(a%i==0 && b%i==0){
                factor=i;
            }
        }
        System.out.println(factor);
    }
}
