package StringPractise;

public class DigitandAlphabetCounr {
    public static int solve(final String A) {
        int n=A.length();
        int alphaCount=0;
        int digitCount=0;
        for(int i=0;i<n;i++){

            if(A.charAt(i)>='a' && A.charAt(i)<='z' || A.charAt(i)>='A' && A.charAt(i)<='Z')
            {
                alphaCount++;
            }
            else{
                if(A.charAt(i)>='0' && A.charAt(i)<='9'){
                    digitCount++;
                }
            }
        }
        if(alphaCount>digitCount){
            return alphaCount;
        }
        else{
            return digitCount;
        }
    }

    public static void main(String args[]){
        String str="HelloUser1";
        System.out.println(solve(str));
    }
}
