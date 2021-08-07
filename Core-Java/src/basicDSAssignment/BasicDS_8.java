package basicDSAssignment;

public class BasicDS_8 {

	public static void main(String[] args) {
		int[] arr= new int[] {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47} ;
		int i,j,n=arr.length;
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]= arr[j] + arr[j+1];
					arr[j+1]= arr[j] - arr[j+1];
					arr[j]= arr[j] - arr[j+1];
				}
			}
		}
		System.out.println("After sorting the array is:");
		for(int k: arr)
			System.out.print(k+" ");
	}

}
