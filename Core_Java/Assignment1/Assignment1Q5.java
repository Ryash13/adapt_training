import java.lang.*;
import java.util.*;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double tax = 0;
    	if(ctc<=180000) 
    		tax = 0;
    	else if(ctc >=180001 && ctc <= 300000)
    		tax = 0.1;
    	else if(ctc>=300001 && ctc<=500000) 
    		tax = 0.2;
    	else if(ctc>=500001 && ctc<=1000000)
    		tax = 0.3;
    		
    	double amount = ctc*tax;
    	return amount;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner scr = new Scanner(System.in);
    	int ctc = scr.nextInt();
    	System.out.println(new TaxAmount().calculateTaxAmount(ctc));
   }
}
