import java.util.*;

public class Assignment4Q7 {
    public static void main(String[] args) {
    	
    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for(HashMap.Entry<String,Integer> map1:map.entrySet()) {
            stringBuilder.append(map1.getKey()+map1.getValue());
        }
        return stringBuilder.toString();
      }
}
