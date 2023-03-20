package Array;

import java.util.Arrays;

public class arraySorting {
	public static void main(String[] args) {
		
	
	int[] z = {10,20,80,2,3,55,10};
//1.0	
     // Arrays.sort(z);
      System.out.println(Arrays.toString(z));
//2.0
      int temp=0;
      for(int i=0;i<z.length;i++) {
    	  for(int j=i+1;j<z.length;j++) {
    		  if(z[i]>z[j]) {
    			 temp=z[i] ;
    			 z[i]=z[j];
    			 z[j]=temp;
    		  }
    	  }
      }
      System.out.println(Arrays.toString(z));
      int max=z[z.length-1];
      int smax=z[z.length-2];
      System.out.println(max+" "+smax);
      
//3.0 BUBBLE SORT
      for(int i=0;i<z.length-1;i++) {
    	  int flag=0;
    	  for(int j=0;j<z.length-1-i;j++) {
    		  if(z[j]>z[j+1]) {
    			   temp=z[j];
    			   z[j]=z[j+1];
    			   z[j+1]=temp;
    			   flag=1;
    			  
    		  }
    	  }
      }
      System.out.println(Arrays.toString(z));

}
}
	
