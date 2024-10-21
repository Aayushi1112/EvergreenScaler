package MoresAlgo;

import java.util.Arrays;
import java.util.List;

public class MoresAlgo {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public static int majorityElement(final List<Integer> A) {
            int cnt=0;
            int maj=A.get(0);
            for(int i=1;i<A.size();i++){
                if(cnt==0){
                    maj=A.get(i);
                    cnt=1;
                }
                if(A.get(i)==maj){
                    cnt++;
                }
                else
                {
                    cnt--;
                }
            }
            int count=0;

            for(int i=0;i<A.size();i++){
                if(A.get(i)==maj){
                    count++;
                }
            }
            if(count>A.size()/2){
                return maj;
            }
            return -1;
        }

        public static void main(String args[]){
            List<Integer> arr= Arrays.asList(444616, 444616, 339326, 258815,
                    444616, 444616, 444616, 101642, 444616, 444616,
                    444616, 870289, 444616, 444616, 122783, 444616,
                    220316, 444616, 444616, 832644, 444616, 783667,
                    444616, 443564, 444616, 952314, 128245, 636505,
                    466978, 675032, 439304, 731997, 444616, 862447, 444616);

            int a=majorityElement(arr);
            System.out.println(a);


        }


}
