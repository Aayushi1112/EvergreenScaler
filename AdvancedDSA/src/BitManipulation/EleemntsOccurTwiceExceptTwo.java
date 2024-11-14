package BitManipulation;

import java.util.ArrayList;

public class EleemntsOccurTwiceExceptTwo {

        public ArrayList<Integer> solve(ArrayList<Integer> A) {
            int xorArr=0;
            ArrayList<Integer> res=new ArrayList<Integer>();
            for(int i=0;i<A.size();i++){
                xorArr=xorArr^A.get(i);
            }
            int pos=0;
            for(int i=0;i<=31;i++){
                if(checkBit(xorArr,i)==true){
                    pos=i;
                    break;
                }
            }

            int xorSet=0;
            int xorunset=0;
            for(int i=0;i<A.size();i++){
                if(checkBit(A.get(i),pos)==true){
                    xorSet=xorSet^A.get(i);
                }
                else{
                    xorunset=xorunset^A.get(i);
                }
            }

            if(xorSet>xorunset){
                res.add(xorunset);
                res.add(xorSet);

            }
            else{
                res.add(xorSet);
                res.add(xorunset);

            }
            return res;
        }
        public boolean  checkBit(int N,int i){
            if(((N>>i)&1)==1){
                return true;
            }
            else{
                return false;
            }
        }
    }



