package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SECOND_THIRD_MAX_ARRAY {
	
	    public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter how many Times you run");
			 int N=sc.nextInt();
			 
			 int max=0,smax=0,tmax=0;

			  int k=0;
			  while(k<N){
				  System.out.println("enter the size of array");
				  int s=sc.nextInt();
				  
				  int [] a=new int[s];

				  for(int i=0;i<a.length;i++){
					  a[i]=sc.nextInt();
				  }
				  System.out.println(Arrays.toString(a));


				  for(int i=0;i<a.length;i++){
					  if(max<a[i]){
						  tmax=smax;
						  smax=max;
						  max=a[i];
					  }
					  else if(smax<a[i]){
						  tmax=smax;
						  smax=a[i];
					  }
					  else if(tmax<a[i]){
						  tmax=a[i];
					  }
				  }
				  System.out.println(max+" "+smax+" "+tmax);
                    k++;
			  }				  

		}
	}

