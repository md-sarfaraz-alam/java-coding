package Array;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		int []x= {10,20,30};
		int []y= {1,21,3};
		
		int j=0;
		int []n=new int[(x.length+y.length)];
		for(int i=0;i<x.length;i++) {
			n[j]=x[i];
			j++;			
		}
		
		for(int i=0;i<y.length;i++) {
			n[j]=y[i];
			j++;
		}
		System.out.println(Arrays.toString(n));
		
		int temp=0;
		for(int k=0;k<n.length;k++) {
			for(int l=k+1;l<n.length;l++) {
				if(n[k]>n[l]) {
					temp=n[k];
					n[k]=n[l];
					n[l]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));

		
	}

}
