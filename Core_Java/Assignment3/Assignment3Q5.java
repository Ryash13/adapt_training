import java.util.*;

class Employee 
{
    private String name;
    private int id;
    
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int hashCode() {
        final int primeNum;
        Scanner scr = new Scanner(System.in);
        primeNum = scr.nextInt();
        int result = 1;
        result = primeNum * result + id;
        result = primeNum * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Employee other = (Employee) object;
        if (id != other.id)
            return false;
        if (name == null) 
        {
            if (other.name != null)
                return false;
         } 
        else if (!name.equals(other.name))
            return false;
            
        return true;
    }
}

public class Assignment3Q5 {
    public static void main(String[] args) {
    }
}
