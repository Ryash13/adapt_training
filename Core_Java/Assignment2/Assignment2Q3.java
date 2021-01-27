import java.util.*;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits - creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits + fixedDepositAmount;
    }
}
public class Assignment2Q3 {
	int deposite;
    public int totalCashInBank(ArrayList<Integer> cash){
    	for (Integer i : cash) {
			deposite += i;
		}
		return deposite;
    }
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {}
}
