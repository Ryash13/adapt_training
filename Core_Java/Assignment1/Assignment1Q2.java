import java.util.*;
import java.lang.*;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=min;i<max;i++){
            int numCpy , rem , compare = 0;
            numCpy = i;
            while(numCpy > 0){
                rem = numCpy % 10;
                compare += Math.pow(rem , 3);
                numCpy /= 10;
            }
            if(i == compare)
                arr.add(i);
        }
        int len = arr.size();
        int ans[] = new int[len];
        Arrays.setAll(ans , arr::get);
        
        return ans;
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {
       int min = 100;int max = 999;
       ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
       int ans[] = obj.armstrongNumbersInRange(min,max);
       for(int i: ans) {
           System.out.println(i);
       }

    }
}
