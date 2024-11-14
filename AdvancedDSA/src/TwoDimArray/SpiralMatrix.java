package TwoDimArray;

import java.util.ArrayList;

public class SpiralMatrix {

        public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {

            ArrayList<ArrayList<Integer>> spiralMat=new ArrayList<ArrayList<Integer>>();
            int N=A;

            if(N==1){
                ArrayList<Integer> newRow = new ArrayList<>();
                newRow.add(1);
                spiralMat.add(newRow);
                return spiralMat;
            }

            for(int row=0;row<N;row++){
                ArrayList<Integer> newRow = new ArrayList<>();
                for(int col=0;col<N;col++){
                    newRow.add(0);

                }
                spiralMat.add(newRow);
            }



            int number=1;
            int i=0;int j=0;
            while(N>=1){
                if(N==1){
                    spiralMat.get(i).set(j,number);
                }
                else {
                    for (int cnt = 1; cnt < N; cnt++) {
                        spiralMat.get(i).set(j, number);
                        j++;
                        number++;
                    }

                    for (int cnt = 1; cnt < N; cnt++) {
                        spiralMat.get(i).set(j, number);
                        i++;
                        number++;
                    }
                    for (int cnt = 1; cnt < N; cnt++) {
                        spiralMat.get(i).set(j, number);
                        j--;
                        number++;
                    }
                    for (int cnt = 1; cnt < N; cnt++) {
                        spiralMat.get(i).set(j, number);
                        i--;
                        number++;
                    }
                }

                N=N-2;
                i++;j++;
            }
            return spiralMat;
        }

        public static void main(String args[]){
            ArrayList<ArrayList<Integer>> res=generateMatrix(7);
            System.out.println(res);
        }

}
