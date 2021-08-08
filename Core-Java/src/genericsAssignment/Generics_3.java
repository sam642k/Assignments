package genericsAssignment;

public class Generics_3 {
	
	public static <T> void swapPos(T[] arr, int i, int j){
		T temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static <T> void display(T[] arr) {
		for(T x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr= {5, 9, 18, 20, 14, 7, 3};
		String[] strArr= {"Five", "Nine", "Eighteen", "Twenty", "Fourteen", "Seven", "Three"};
		Double[] doubleArr= {5.33, 9.74, 18.548, 20.2, 14.222, 7.7, 3.60};
		System.out.println("\nArrays before swaping\n");
		display(arr);
		display(strArr);
		display(doubleArr);
		swapPos(arr, 1,3);
		swapPos(strArr, 0, 4);
		swapPos(doubleArr, 2, 5);
		System.out.println("\nArrays after swaping\n");
		display(arr);
		display(strArr);
		display(doubleArr);
	}

}
