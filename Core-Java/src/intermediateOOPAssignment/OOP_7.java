package intermediateOOPAssignment;
import java.util.*;

abstract class DesertItem{
	abstract int getCost();
}

class Candy extends DesertItem{
	int price=3;
	int getCost() {
		return price*60;
	}
	@Override
	public String toString() {
		return "Candy [price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		return price == other.price;
	}
	
}

class Cookie extends DesertItem{
	int price=2;
	int getCost() {
		return price*70;
	}
	@Override
	public String toString() {
		return "Cookie [price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cookie other = (Cookie) obj;
		return price == other.price;
	}
	
}

class IceCream extends DesertItem{
	int price=110;
	int getCost() {
		return price;
	}
	@Override
	public String toString() {
		return "IceCream [price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCream other = (IceCream) obj;
		return price == other.price;
	}
	
}

class Storage{
	static Map<DesertItem,Integer> items= new HashMap<>();
	static void addItem(DesertItem item) {
		if(items.containsKey(item))
			items.put(item, items.get(item)+1);
		else
			items.put(item,1);
	}
	static boolean removeItem(DesertItem item) {
		if(items.containsKey(item)) {
			if(items.get(item)==1)
				items.remove(item);
			else
				items.put(item, items.get(item)-1);
			return true;
		}
		else
			return false;
	}
	static void printItems(){
		System.out.println(items);
	}
}

public class OOP_7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("1.Owner  2.Customer  3.Exit");
			int ch= sc.nextInt(), con=1;
			if(ch==1) {
				do {
					System.out.println("Add 1.Candy  2.Cookie  3.IceCream   4.Show Items   5.Exit");
					int x= sc.nextInt();
					switch(x){
						case 1:
							DesertItem candy= new Candy();
							Storage.addItem(candy);
							break;
						case 2:
							DesertItem cookie= new Cookie();
							Storage.addItem(cookie);
							break;
						case 3:
							DesertItem ice= new IceCream();
							Storage.addItem(ice);
							break;
						case 4:
							Storage.printItems();
							break;
						case 5:
							con=0;
							break;
						default: System.out.println("Enter appropriate choice");
					}
				}while(con==1);
			}
			else if(ch==2) {
				do {
					System.out.println("Place Your Order: 1.Candy  2.Cookie  3.IceCream 4.Exit");
					int or= sc.nextInt();
					switch(or) {
						case 1:
							Candy candy= new Candy();
							if(Storage.removeItem(candy))
								System.out.println("The cost is: Rs"+candy.getCost());
							else
								System.out.println("Out of Candy");
							break;
						case 2:
							Cookie cookie= new Cookie();
							if(Storage.removeItem(cookie))
								System.out.println("The cost is: Rs"+cookie.getCost());
							else
								System.out.println("Out of Candy");
							break;
						case 3:
							IceCream ice= new IceCream();
							if(Storage.removeItem(ice))
								System.out.println("The cost is: Rs"+ice.getCost());
							else
								System.out.println("Out of Candy");
							break;
						case 4:
							con=0;
							break;
						default: System.out.println("Enter appropriate choice");
					}
				}while(con==1);
			}
			else
				return;
		}
	}

}
