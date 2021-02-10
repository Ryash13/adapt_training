import java.util.*;
import java.lang.*;

public class Assignment4Q4 {

    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
        employeeList.removeIf(string->(string.length()%2 !=0));
        return employeeList;
    }
    
    public static void main(String[] args) {
        
    }
}
