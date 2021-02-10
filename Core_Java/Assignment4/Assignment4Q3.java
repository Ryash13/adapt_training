import java.util.function.*;

public class Assignment4Q3 {

	static int modifyValue(int value, Function<Integer, Integer> func) {
      int output = func.apply(value);
      return output;
	}

	static class Product {
      private double price = 0.0;

      public void setPrice(double price) {
        this.price = price;
		}

		public void printPrice() {
			  System.out.println(price);
		}
	}

	static void display() {
      Consumer<Integer> disp = a -> System.out.println(a);
      disp.accept(100);
      Function<Integer, Double> halfValue = a -> a / 10.0;
      Predicate<Integer> predicate = a -> (a > 10);
      Supplier<Integer> argument = ()-> 10;
	}

	public static void main(String[] args) {
      display();
      modifyValue(5, v -> v + 10);
      Consumer<Product> getPrice = p -> p.setPrice(92.1);
      Product product = new Product();
      getPrice.accept(product);
      product.printPrice();
	}
}
