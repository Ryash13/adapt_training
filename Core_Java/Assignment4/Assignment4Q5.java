import java.util.*;
import java.lang.*;

public class Assignment4Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    static StringBuffer stringBuffer = new StringBuffer();
    static Consumer<List<String>> updateList = list -> {
      for (String str : list) {
        stringBuffer.append(str.charAt(0));
      }
	};

	public static String processWords(List<String> list) {
      updateList.accept(list);
      return stringBuffer.toString();
	}

	public static void main(String[] args) {
      System.out.println(processWords(list));
	}
}
