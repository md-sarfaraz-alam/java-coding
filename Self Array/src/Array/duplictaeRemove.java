package Array;

import java.util.*;

public class duplictaeRemove {

	public static void main(String[] args) {
		int []arr= {1,1,22,22,3,4,5,6,8,7,3,4,5};
		
////1.0
//		//TreeSet<Integer> hs=new TreeSet<>();
//		ArrayList<Integer> list= new ArrayList<>();
//		
//		for(int i=0;i<arr.length;i++) {
//			if(list.contains(arr[i])==false) {
//				list.add(arr[i]);
//			}
//		}
		
		
//		System.out.println(list);
		
//		Iterator itr = hs.iterator();
//		 while (itr.hasNext()) {
//	            System.out.print(itr.next()+" ");
//	        }
		
		
//2.0  pehle sort krdo
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
		System.out.println(Arrays.toString(arr));
		
		int [] na=new int[arr.length];
		int p=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				na[p]=arr[i];
				p++;
			}
		}
		na[p]=arr[arr.length-1];
		
		System.out.println(Arrays.toString(na));
		
		for(int i=0;i<=p;i++) {
			System.out.print(na[i]+" ");
		}

	}

}
