public class Print1toA {
    public static void main(String[] args) {
        print1toA(10);
    }

    static void print1toA(int n) {
        if (n == 0) {
            return;
        }
        print1toA(n - 1);
        System.out.println(n);

}
