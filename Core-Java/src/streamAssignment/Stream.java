package streamAssignment;

import java.util.*;

public class Stream {
	
	public static void main(String[] args) {
		List<Fruit> fruits= new ArrayList<>(List.of(
				new Fruit("Apple", 65, 30, "Red"),
				new Fruit("Mango", 120, 80, "Yellow"),
				new Fruit("Banana", 80, 40, "Yellow"),
				new Fruit("Orange", 60, 25, "Orange"),
				new Fruit("Pomegrenate", 70, 50, "Red")
			));
		
		List<News> news= Arrays.asList(
				new News(12, "bruce", "Steve", "One last trip"),
				new News(25, "Steve", "Bruce", "No!, budget is not settled"),
				new News(65, "Steve", "Tony", "No need to worry about the budget"),
				new News(41, "Tony", "Thor", "Nice")
				);
		
		System.out.println("1");
		fruits.stream().filter(fruit -> fruit.getCalories()<100)
		.sorted((f1, f2) -> f2.getCalories()-f1.getCalories()).forEach(System.out::println);
		
		System.out.println("2");
		fruits.stream().sorted((f1, f2) -> f1.getColor().compareTo(f2.getColor()))
		.forEach(f-> System.out.println(f.getColor()+" "+f.getName()));
		
		System.out.println("3");
		fruits.stream().filter(f -> f.getColor()=="Red")
		.sorted((f1, f2) -> f1.getPrice()-f2.getPrice()).forEach(System.out::println);
		
		System.out.println("4");
		System.out.println(news.stream().sorted((n1,n2) -> n2.getComment().compareTo(n1.getComment())).findFirst());
		
		System.out.println("5");
		news.stream().forEach(n -> {
			int count=0;
			if(n.getComment().contains("budget"))
				count++;
		});
	}
}
