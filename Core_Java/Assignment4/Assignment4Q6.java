import java.util.*;
import java.lang.*;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
      Assignment4Q6 assignment = new Assignment4Q6();
      System.out.println(assignment.convertToUpperCase(list));
	}

	public List<String> convertToUpperCase(List<String> list) {
      UnaryOperator<String> converToUpper = str -> str.toUpperCase();
      list.replaceAll(converToUpper);
      return list;
	}
}
