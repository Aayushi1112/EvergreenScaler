package StringPractise;

import java.util.Scanner;

public class StringLength {

        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            int t=2;
            for(int i=1;i<=t;i++){
                String str=scn.nextLine();
                System.out.println(str.length());
            }
        }
    }

