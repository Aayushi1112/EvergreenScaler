package BasicDSA;


import java.lang.*;
import java.util.*;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sp=544251954;
        int cp=562258586;
        if(sp>cp){
            int profit=sp-cp;
            System.out.println(1);
            System.out.println(profit);
        }
        else
        {
            int loss=cp-sp;
            System.out.println(-1);
            System.out.println(loss);
        }
    }
}
