package Array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int x[]= {11,22,98,10,23,32,45};
		
		//sorting
		int temp=0;
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
//1.0	just printing the array from last(Reverse)	
		System.out.println(Arrays.toString(x));
		
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]+" ");
		}
	
	
//2.0 reversing the array without using any 2nd array
	   int i=0;
	   int j=x.length-1;
	   
	   while(i<j) {
		   temp=x[i];
		   x[i]=x[j];
		   x[j]=temp;
		   i++;
		   j--;
	   }
	   System.out.println(Arrays.toString(x));
	   
//3.0 using the another array reverse
	   
	   int y[]=new int[x.length];
	   int p=0;
	   
	   for(int l=x.length-1;l>=0;l--) {
		   y[p]=x[l];
		   p++;
	   }
	   System.out.println(Arrays.toString(y));
	   
	   
	}
}
