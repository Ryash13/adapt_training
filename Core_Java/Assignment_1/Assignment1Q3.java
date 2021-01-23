import java.util.*;
import java.lang.*;


class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double SI;
        SI = (principalAmount*time*interestRate)/100;
        return SI;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double CI;
        interestRate = (1+interestRate/100);
        interestRate = Math.pow(interestRate,time);
        double amount = principalAmount * interestRate;
        CI = amount - principalAmount;
        return CI;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
        Scanner s = new Scanner(System.in); 
        int t;
        double p , r;
        p = s.nextDouble();
        r = s.nextDouble();
        t = s.nextInt();
        System.out.println(new SiCi().simpleInterest(p,t,r));
        System.out.println(new SiCi().compoundInterest(p,t,r));
    }
}
