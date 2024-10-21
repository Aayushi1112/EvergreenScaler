package ArrayList;

import java.util.ArrayList;

public class FrequencyOfEachElement {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n=A.size();
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            res.add(frequency(A.get(i),A));
        }
        return res;
    }
    public static int frequency(int a, ArrayList<Integer> A){
        int n=A.size();
        int count=0;
        for(int i=0;i<n;i++){
            int ans=A.get(i);
            boolean ans1=(A.get(i)==a);
            if(A.get(i)==a){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(300);
        //arr.add(23);
        //arr.add(23);
        //arr.add(388);
        //arr.add(1023);
        //arr.add(1333);
       // arr.add(3345);
        //arr.add(23);
        arr.add(300);
       // arr.add(1023);
       // arr.add(1023);
        //arr.add(1);

        ArrayList<Integer> arr1=solve(arr);
        System.out.println(arr1);

    }
}
