package Matrices;

import java.util.ArrayList;

public class MatricesAddition {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int rowCount=A.size();
        int colCount=A.get(0).size();
        ArrayList<ArrayList<Integer>> C=new ArrayList<ArrayList<Integer>>();
        for(int r=0;r<rowCount;r++){
            for(int c=0;c<colCount;c++){
                C.get(r).set(c,(A.get(r).get(c)+B.get(r).get(c)));
            }
        }
        return C;
    }
    public static void main(String[] args) {
        // Create matrix A
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> rowA = new ArrayList<>();
        rowA.add(1);
        rowA.add(2);
        rowA.add(3);
        A.add(rowA);

        // Create matrix B
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> rowB = new ArrayList<>();
        rowB.add(1);
        rowB.add(2);
        rowB.add(3);
        B.add(rowB);
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        C=solve(A,B);
        System.out.println(C);


    }
    }

