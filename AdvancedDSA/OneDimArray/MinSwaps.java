public class MinSwaps {
        public int solve(ArrayList<Integer> A, int B) {
            int n=A.size();
            int count=0;
            for(int i=0;i<n;i++){
                if(A.get(i)<=B){
                    count++;
                }
            }
            int swapCount=0;
            for(int j=0;j<count;j++){
                if(A.get(j)>B){
                    swapCount++;
                }
            }
            return swapCount;
        }

    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(
//                52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5,
//                84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29,
//                7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70
//        ));

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(
                2,4,12,14,18,16,19,20,6,7,5,4
        ));

        int B = 8;

       solve(A, B);
        System.out.println("Number of swaps required: " + result);
    }


}
