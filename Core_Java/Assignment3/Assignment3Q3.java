import java.util.*;

public class Assignment3Q3 {
    public static List traverseReverse(ArrayList<String> List)
    {
    	 ArrayList<String> rev = new ArrayList<String>(); 
         for (int i = List.size() - 1; i >= 0; i--) 
         { 
             rev.add(List.get(i)); 
         }
		return rev;
	}
    public static void main(String[] args) 
    {
    	ArrayList<String> newList = new ArrayList<String>();
    	ArrayList<String> reverseList = new ArrayList<String>();
        newList.add("Ankit");
        newList.add("Pawan");
        newList.add("Jay");
        newList.add("Jimmy");
        newList.add("Yash");
        System.out.println(newList);
        reverseList=(ArrayList<String>) traverseReverse(newList);
        ListIterator<String> List=reverseList.listIterator();
        while (List.hasNext()) {
            System.out.print(List.next()+" ");
         }
    }
}
