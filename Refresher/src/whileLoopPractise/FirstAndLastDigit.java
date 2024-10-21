package whileLoopPractise;


import java.util.Scanner;

public class FirstAndLastDigit {
        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            int t=scn.nextInt();

            int count=1;
            while(count<=t)
            {
                int no=scn.nextInt();
                int lastDigit=no%10;
                int firstDigit=0;
                no=no/10;
                if(no!=0){
                    int d=0;
                    while(no!=0){
                        d=no%10;
                        no=no/10;
                    }
                    firstDigit=d;

                }
                else{
                    firstDigit=lastDigit;
                }
                System.out.println(firstDigit+ " "+lastDigit);
               count++;
            }

        }
    }

