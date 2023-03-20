package Array;

import java.util.Arrays;

public class copy_array {
	public static void main(String[] args) {
		int []l= {21,54,45,6};
		System.out.println(Arrays.toString(l));
		
		int []c=l;
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

}
