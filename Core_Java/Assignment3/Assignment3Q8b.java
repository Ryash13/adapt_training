import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
    	list.add(12);
    	list.add(10);
    	list.add(5);
    	Iterator itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer num = (Integer)itr.next(); 
            System.out.println(num);
                list.add(20); 
        } 
    	
    	return list;
    }
    public static void main(String args[]) {
    	CopyOnWriteArrayList<Integer> l1 = new CopyOnWriteArrayList<Integer>();
    	CopyOnWriteArrayList<Integer> l2 = failFast(l1);
    	
    	Iterator itr = l2.iterator(); 
        while (itr.hasNext()) { 
            Integer num = (Integer)itr.next(); 
            System.out.println(num);
        } 
    }
}
