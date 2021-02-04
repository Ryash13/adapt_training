import java.util.*;
import java.util.stream.Collectors;

class Fruit 
{
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) 
    {
        super();
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getCalories() 
    {
        return calories;
    }

    public void setCalories(int calories) 
    {
        this.calories = calories;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    @Override
    public String toString() 
    {
        return "Fruit{name=" + "'"+name + "'"+", calories=" + calories + ", price=" + price + ", color=" +  "'"+color +"'"+ "}";
    }
}

public class Assignment5Q1 
{

	public static List<String> reverseSort(ArrayList<Fruit> fruits) 
  {
      List<Fruit> list = new ArrayList<>();
      List<String> rList = new ArrayList<String>();
      list = fruits.stream().filter(i -> i.getCalories() < 100).sorted((f1, f2) -> f2.getCalories() - f1.getCalories()).collect(Collectors.toList());
      list.stream().sorted();
      list.stream().forEach(i -> { reverseList.add(i.getName())});
      return rList;
	}

	public static ArrayList<Fruit> sort(ArrayList<Fruit> fruit) 
	{
      List<Fruit> obj = new ArrayList<>();
      obj = fruit.stream().sorted((f1, f2) -> f1.getColor().compareTo(f2.getColor())).collect(Collectors.toList());
      return (ArrayList<Fruit>) obj;
	}

	public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits) 
  {
      List<Fruit> object = fruits.stream().filter(i -> i.getColor().equalsIgnoreCase("Red")).sorted((f1, f2) -> f1.getPrice() - f2.getPrice()).collect(Collectors.toList());
      return (ArrayList<Fruit>) object;
	}

	public static void main(String[] args) 
  {
      
	}
}
