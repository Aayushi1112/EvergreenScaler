package PractiseRough;



import java.util.Scanner;

    public class Elemenst {
        public static void main(String[] args) {
            int t=2;
            int testcount=1;
            while(testcount<=t){
                int arr[]={10,20,30,40,50};
                int b=490;
                boolean flag=false;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==b){
                        flag=true;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
                testcount++;
            }

        }
    }


