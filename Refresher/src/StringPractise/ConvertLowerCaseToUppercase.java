package StringPractise;

public class ConvertLowerCaseToUppercase {
    public  static String solve(String A) {
        StringBuilder result = new StringBuilder();
        int n = A.length();
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if (ch >= 'a' && ch<= 'z') {
                ch= (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String args[]) {
        String s = "Happy";

        System.out.println(solve(s));


    }
}

