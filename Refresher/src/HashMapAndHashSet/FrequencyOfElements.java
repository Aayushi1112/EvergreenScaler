package HashMapAndHashSet;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyOfElements {

    public static int solve(ArrayList<Integer> A) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (hm.containsKey(A.get(i))) {
                int freq = hm.get(A.get(i));
                hm.put(A.get(i), freq + 1);

            } else {
                hm.put(A.get(i), 1);
            }
        }
        int count = 0;
        hm.entrySet();
        for (Integer a : hm.keySet()) {
            if (hm.get(a) == 1) {
                count++;
            }
        }
        return count;

    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(100);
        arr.add(100);
        arr.add(1000);
        arr.add(1000);
        arr.add(112);
        System.out.print(solve(arr));


    }
}


