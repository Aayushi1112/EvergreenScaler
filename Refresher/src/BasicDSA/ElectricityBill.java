package BasicDSA;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int units=scn.nextInt();
        double bill=0;
        double amount=0;
        if(units<=50)
        {
            bill=units*0.50;
            amount=bill+0.20*bill;

        }
        else if(units<=150){
            bill=50*0.50 +(units-50)*0.75;
            amount=bill+0.20*bill;

        }
        else if(units<=250){
            bill=50*0.50+100*0.75+(units-150)*1.20;
            amount=bill+0.20*bill;
        }
        else if(units>250){
            bill=50*0.50+100*0.75+100*1.20+(units-250)*1.50;
            amount=bill+0.20*bill;
        }

        System.out.println((int)amount);

    }
}
