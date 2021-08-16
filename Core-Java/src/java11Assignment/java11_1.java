package java11Assignment;

@FunctionalInterface
interface Perform{
	int perform(int p, int t, int r);
}

public class java11_1 {
	public static void main(String[] args) {
		var p=2000;
		var t=3;
		var r=10;
		Perform interest= (var px, var tx, var rx) -> (px*tx*rx)/100;
		System.out.println(interest.perform(p,t,r));
	}
}
