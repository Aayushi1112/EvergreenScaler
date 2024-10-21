package BasicDSA;

public class CountOfPrimes {

    public static  int solve(int A){
        int count=0;
        for (int i = 2; i <= A; i++) {
            boolean flag = true;

            int no = i;
            for (int j = 2; j < no; j++) {
                if (no % j == 0) {
                    flag = false;
                    break;
                }

            }

            if (flag == true) {
                count++;
            }
        }

        return count;
    }
    public static void main(String args[]){
        int n=10;
        System.out.println(solve(n));
    }
}
