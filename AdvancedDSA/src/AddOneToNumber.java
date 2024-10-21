import java.util.ArrayList;

public class AddOneToNumber {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int carry=1;
        reverseArray(A);//4321
        int num=0;
        for(int i=0;i<A.size();i++){
            num=A.get(i)+carry;
            A.set(i,num%10);
            carry=num/10;
        }
        if(carry!=0){
            A.add(carry);
        }
        reverseArray(A);
        while (A.size() > 0 && A.get(0) == 0) {
            A.remove(0);
        }

        return A;




    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> A){
        int start=0;
        int end=A.size()-1;
        int temp=0;
        while(start<=end){
            temp=A.get(start);
            A.set(start,A.get(end));
            A.set(end,temp);
            start++;
            end--;
        }
        return A;
    }

    public static void main(String args[]){
        // Create an ArrayList of integers



        // Print the ArrayList
       // System.out.println(arrayList);
        ArrayList<Integer> arrayList= new ArrayList<>();

        // Add numbers to the ArrayList
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        System.out.println("original");
        System.out.println(arrayList);


        System.out.println("new");
        ArrayList<Integer> result2=plusOne(arrayList);
        System.out.println(result2);



    }
}
