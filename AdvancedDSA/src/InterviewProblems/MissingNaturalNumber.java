package InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNaturalNumber {
        public static int firstMissingPositive(ArrayList<Integer> A) {
            int n=A.size();
            for(int i=0;i<n;i++){
                if(A.get(i)<=0){
                    A.set(i,n+2);
                }
            }
            for(int i=0;i<n;i++){
                int ele=Math.abs(A.get(i));

                if(ele<=n && A.get(ele-1)>0){
                    A.set(ele-1,-(A.get(ele-1)));
                }
            }

            for(int i=0;i<n;i++){
                if(A.get(i)>0){
                    return i+1;
                }
            }
            return n+1;
        }

        public static void main(String args[]){
            ArrayList<Integer> ar=new ArrayList<Integer>();
            ar.add(2);
            ar.add(3);
            ar.add(1);
            ar.add(2);
            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                    //417, 929, 845, 462, 675, 175, 73, 867, 14, 201, 777, 407
                    1

            ));

            int n=firstMissingPositive(numbers);
            System.out.println(n);


        }
    }


