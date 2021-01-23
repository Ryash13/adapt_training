import java.lang.*;
import java.util.*;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int numCpy , rem , result = 0;
        numCpy = num;
        while(numCpy > 0) {
            rem = numCpy % 10;
            result += Math.pow(rem , 3);
            numCpy = numCpy / 10;
        }
        if(num == result)
            return true;
        else
            return false;
    }
}

public class Assignment1Q1 {
    public static void main (String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        boolean ans = armstrongCheck(num);
        if(ans == true) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
