import java.util*;
import java.lang.*;

public class Assignment3Q2 {
    public static void main(String[] args) {
    	  LinkedHashSet<Integer> Set = new LinkedHashSet<>();
    	  Set.add(10);
    	  Set.add(12);
    	  Set.add(20);
    	  Set.add(11);
    	  Set.add(19);
    	  if(Set == ordered(Set)) {
    		    System.out.println("ordered");
    	  }
    	  else {
    	      System.out.println("unordered");
        }
    	  System.out.println(ordered(Set));
    	  HashSet<Integer> hSet = new HashSet<>();
    	  hSet.add(10);
    	  hSet.add(12);
    	  hSet.add(20);
    	  hSet.add(11);
    	  hSet.add(19);
    	  if(Set == unordered(hSet)) {
    		    System.out.println("ordered");
    	  }
    	  else {
        	System.out.println("unordered");
        }
    	  System.out.println(unordered(hSet));
    }
    public static LinkedHashSet<?> ordered(LinkedHashSet<?> linkedHashSet){ 
        return linkedHashSet;
    }
    public static HashSet<?> unordered(HashSet<?> hashSet){
    	  return hashSet;
    }
}
