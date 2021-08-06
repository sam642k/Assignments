package IntermediateOOPAssignment;
import java.util.*;

abstract class DesertItem{
	abstract int getCost();
}

class Candy extends DesertItem{
	int price=3;
	int getCost() {
		return price*60;
	}
}

class Cookie extends DesertItem{
	int price=2;
	int getCost() {
		return price*70;
	}
}

class IceCream extends DesertItem{
	int price=110;
	int getCost() {
		return price;
	}
}

class Storage{
	static List<DesertItem> itemList= new ArrayList<>();
	static void addItem(DesertItem item) {
		itemList.add(item);
	}
	static void printItems(){
		System.out.println(itemList);
	}
}

public class OOP_7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Owner   2.Customer");
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
		else {
			System.out.println("Place Your Order: 1.Candy  2.Cookie  3.IceCream");
			int or= sc.nextInt();
			switch(or) {
				case 1:
					Candy candy= new Candy();
					System.out.println("The cost is: Rs"+candy.getCost());
					break;
				case 2:
					Cookie cookie= new Cookie();
					System.out.println("The cost is: Rs"+cookie.getCost());
					break;
				case 3:
					IceCream ice= new IceCream();
					System.out.println("The cost is: Rs2"+ice.getCost());
					break;
			}
		}
	}

}
