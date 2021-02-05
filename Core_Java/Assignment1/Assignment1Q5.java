import java.util.*;
import java.lang.*;

class TaxAmount{
    public double calculateTaxAmount(int ctc)
    {
        double toPay=0;
        if(ctc<=180000)
        {
            toPay = 0;
            return toPay;
        }
        else if(ctc>=181001 & ctc>=300000)
        {
            toPay=ctc*0.1;
            return toPay;
        }
        else if(ctc>=300001 && ctc>=500000)
        {
            toPay=ctc*0.2;
            return toPay;
        }
        else if(ctc>= 500001 && ctc>=1000000)
        {
            toPay=ctc*0.3;
            return toPay;
        }
        else
        {
            toPay=ctc*0.1;
            return toPay;
        }
    }
}

public class Assignment1Q5 {
    public static void main(String args[]) 
    {
        TaxAmount obj = new TaxAmount();
        int ctc;
        Scanner scr = new Scanner(System.in);
        ctc = scr.nextInt();
        System.out.println(new TaxAmount().calculateTaxAmount(ctc));
    }
}
