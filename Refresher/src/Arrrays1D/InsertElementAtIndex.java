package Arrrays1D;

import java.util.Scanner;

/****
 * 1.enter a number n by user which is no of elements in array
 * 2.Initializing arrray with one extra index because its size will increase
 *   when we have added one element to it
 *  3.Iterate the loop to n and fill values until n-1
 *  4.We do a positon-- because the positon enetered by user is 3
 *  but according to array it is 2
 *  5.we will loop from n-1 to position and shift the items from one place to the next until we reach the posotion
 *  6.once we reach positon we will break the loop and enter the element there.
 */
public class InsertElementAtIndex {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int arr[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int position=scn.nextInt();
        position--;
        int element=scn.nextInt();
        for(int i=n-1;i>=position;i--){
            arr[i+1]=arr[i];
        }
        arr[position]=element;

        for(int i=0;i<=n;i++){
            System.out.print(arr[i]);
        }











    }
}
