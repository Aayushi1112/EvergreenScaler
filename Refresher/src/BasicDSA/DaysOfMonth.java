package BasicDSA;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int days=0;
        switch(n)
        {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2:
                days=28;
                break;
        }
        System.out.println(days);

    }
}
