package BasicDSA;

import java.util.Scanner;

public class PrimeNosOneToN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 20;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            int no = i;
            for (int j = 2; j < no; j++) {
                if (no % j == 0) {
                    flag = false;
                    break;
                }

            }

        if (flag == true) {
            System.out.print(i+ " ");
        }
    }
    }
}
