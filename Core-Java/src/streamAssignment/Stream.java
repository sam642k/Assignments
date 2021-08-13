package streamAssignment;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class Stream {
	
	public static void main(String[] args) {
		List<Fruit> fruits= Arrays.asList(
				new Fruit("Apple", 65, 30, "Red"),
				new Fruit("Mango", 120, 80, "Yellow"),
				new Fruit("Banana", 80, 40, "Yellow"),
				new Fruit("Orange", 60, 25, "Orange"),
				new Fruit("Pomegrenate", 70, 50, "Red")
			);
		
		List<News> news= Arrays.asList(
				new News(12, "bruce", "Steve", "One last trip"),
				new News(25, "Steve", "Bruce", "No!, budget is not settled"),
				new News(65, "Steve", "Tony", "No need to worry about the budget"),
				new News(41, "Tony", "Thor", "Nice"),
				new News(41, "Steve", "Bruce", "Nevermind")
				);
		
		List<Trader> traders= Arrays.asList(
				new Trader("Tony", "New york"),
				new Trader("Thor", "Asgard")
				);
		
		List<Transaction> transactions= Arrays.asList(
				new Transaction(traders.get(0), 2011, 5000),
				new Transaction(traders.get(0), 2011, 5000),
				new Transaction(traders.get(0), 2011, 5000),
				new Transaction(traders.get(0), 2011, 5000)
				);
		
		System.out.println("\n1");
		fruits.stream().filter(fruit -> fruit.getCalories()<100)
		.sorted((f1, f2) -> f2.getCalories()-f1.getCalories()).forEach(System.out::println);
		
		System.out.println("\n2");
		fruits.stream().sorted((f1, f2) -> f1.getColor().compareTo(f2.getColor()))
		.forEach(f-> System.out.println("Color: "+f.getColor()+"     Fruit: "+f.getName()));
		
		System.out.println("\n3");
		fruits.stream().filter(f -> f.getColor()=="Red")
		.sorted((f1, f2) -> f1.getPrice()-f2.getPrice()).forEach(System.out::println);
		
		System.out.println("\n4");
		System.out.println(news.stream().sorted((n1,n2) -> n2.getComment().compareTo(n1.getComment())).findFirst().get());
		
		System.out.println("\n5");
		System.out.println(news.stream().filter(n -> n.getComment().contains("budget")).count());
		
		System.out.println("\n6");
		List<String> comments=new ArrayList<String>();
		for(News n: news) {
			comments.add(n.getCommentByUser());
		}
		System.out.println(comments.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	            .entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey());
		
		System.out.println("\n--7--");
		comments.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().forEach(e -> System.out.println("User: "+e.getKey()+ "    No of Comments: "+e.getValue()));
		
		System.out.println("\n8");
		
		
	}
}
