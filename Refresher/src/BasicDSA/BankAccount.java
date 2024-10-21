package BasicDSA;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int initialBalance=scn.nextInt();
        int noOfOperations=scn.nextInt();
        int count=1;
        while(count<=noOfOperations)
        {
            int operationType=scn.nextInt();
            int rupees=scn.nextInt();
            if(operationType==1){
                initialBalance+=rupees;
                System.out.println(initialBalance);
            }
            else{
                if(rupees>initialBalance){
                    System.out.println("Insufficient Funds");
                }
                else{
                    initialBalance-=rupees;
                    System.out.println(initialBalance);
                }

            }

            count++;

        }
    }
}
