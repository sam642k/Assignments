package junitAssignment;

class Find{
	int min;
	int max;
	
	public Find(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Find other = (Find) obj;
		return max == other.max && min == other.min;
	}

	
}

public class Junit_2 {
	Find findMinMax(int[] arr) {
		int min=arr[0], max=arr[0];
		for(int x: arr) {
			if(min>x)
				min=x;
		}
		for(int x: arr) {
			if(max<x)
				max=x;
		}
		return new Find(min, max);
	}
}
