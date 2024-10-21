package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDivisibelBy5and7 {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(2);
        arr.add(35);
        arr.add(8);
        arr.add(7);
        List<Integer> arrNew=new ArrayList<Integer>();

        arrNew=divisible(arr);
        System.out.print(arrNew);

    }
    public static List<Integer> divisible(List<Integer> A) {
        int n=A.size();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(A.get(i)%5==0 && A.get(i)%7==0){
                arr.add(A.get(i));
            }

        }
        return arr;
    }
}

