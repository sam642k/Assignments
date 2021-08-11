package lambdaAssignments;
import java.util.*;
import java.util.function.*;


class Order{
	int id;
	int price;
	String status;
	
	public Order(int id, int price, String status) {
		super();
		this.id = id;
		this.price = price;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", status=" + status + "]";
	}
}


public class Lambda_2 {

	static void printOrders(List<Order> orders, Predicate<Order> p) {
		for(Order o: orders) {
			if(p.test(o))
				System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Order> orders= Arrays.asList(
				new Order(31, 18000, "Accepted"),
				new Order(54, 12000, "Cancelled"),
				new Order(78, 9500, "Completed"),
				new Order(16, 15000, "Accepted"),
				new Order(12, 11500, "Completed")
				);
		printOrders(orders, o -> o.price>10000 && (o.status=="Accepted" || o.status=="Completed"));
	}

}