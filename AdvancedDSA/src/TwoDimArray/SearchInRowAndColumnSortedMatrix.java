package TwoDimArray;

import java.util.ArrayList;

public class SearchInRowAndColumnSortedMatrix {
    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n=A.size();
        int m=A.get(0).size();
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            if(A.get(i).get(j)==B){
                for(int k=j-1;k>=0;k--){
                    if(A.get(i).get(k)==B)
                    {
                        j=k;
                    }

                }
                return ((i+1)*1009)+j+1;
            }
            else if(B<A.get(i).get(j)){
                j--;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Adding the first row
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        matrix.add(row1);
// Adding the second row
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(6);
        row2.add(7);
        row2.add(8);
        matrix.add(row2);

        // Adding the third row
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(9);
        row3.add(10);
        row3.add(11);
        row3.add(12);
        matrix.add(row3);

        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }

        int ans=solve(matrix,11);
        System.out.println(ans);
    }
}
