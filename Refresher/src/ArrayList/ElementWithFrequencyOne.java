package ArrayList;

import java.util.ArrayList;

public class ElementWithFrequencyOne {
    public static int solve(ArrayList<Integer> A) {

        int n=A.size();
        for(int i=0;i<n;i++){
            int freq=findFreq(A.get(i),A);
            if(freq==1){
                return A.get(i);
            }
        }
        return 0;
    }

    private static int findFreq(Integer element, ArrayList<Integer> A) {
        int n=A.size();
        int count=0;
        for(int i=0;i<n;i++){
            if(A.get(i)==element){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(100);
        arr.add(100);
        arr.add(1000);
        arr.add(1000);
        arr.add(112);
        System.out.print(solve(arr));



    }
}
