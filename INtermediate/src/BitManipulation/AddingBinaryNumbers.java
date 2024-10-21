package BitManipulation;

public class AddingBinaryNumbers {
    public static String addBinary(String A, String B) {
        int aLen = A.length();
        int bLen = B.length();
        int longString;

        if (aLen < bLen) {
            longString = bLen;
            while (aLen < bLen) {
                A = "0" + A;
                aLen++;
            }
        } else {
            longString = aLen;
            while (bLen < aLen) {
                B = "0" + B;
                bLen++;

            }
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = longString-1; i >= 0; i--) {
            int bit1 = A.charAt(i) - '0';
            int bit2 = B.charAt(i) - '0';
            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;

        }

        if (carry != 0) {
            result.append(carry);
        }


        result.reverse();
        return result.toString();
    }

    public static void main(String args[]){
        String res=addBinary("1001","111");

        System.out.print("hello"+res);
    }


}
