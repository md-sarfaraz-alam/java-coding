package Array;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {

		int [] x= {10,20,30,40,50};
		
		System.out.println(x.length);
		
//1. another method to print array.		
		System.out.println(Arrays.toString(x));
		
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
//2. method to add element in array
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		System.out.println(sum);
		
//3. average of array
		int average=sum/x.length;
		System.out.println(average);
		
//4. sum of two array
		
		int[]z= {11,22,33,44,45};
		
		int[] y=new int[x.length];
		for(int i=0;i<x.length;i++) {
			y[i]=x[i]+z[i];
		}
		System.out.println(Arrays.toString(y));
		
		int []l=z;
//5. == operator in array		
		if(l==z) {
			System.out.println("true");
			
		}
//6. equals() in array		
		System.out.println(Arrays.equals(z, x)); 

		

	}

}
