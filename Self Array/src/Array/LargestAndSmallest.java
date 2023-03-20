package Array;

public class LargestAndSmallest {
	public static void main(String[] args) {
		
		//1.0 largest
		int[] arr= {12,10,12,22,30,2,3};
		
		int max=12,min=12;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		//2.0 smallest
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
