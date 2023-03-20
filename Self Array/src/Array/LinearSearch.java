package Array;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	int []x= {10,86,36,45,21,89,31,20};
	
	Scanner sc=new Scanner(System.in);
	int i = sc.nextInt();
	
	int flag=-1;
	
	for(int z=0;z<x.length;z++) {
		if(i==x[z]) {
			flag=z;
			break;
		}
		
		}
	if(flag==-1) {
		System.out.println("not found");
	
	}else {
		System.out.println("found at index "+flag);
	}
	
 }
}
