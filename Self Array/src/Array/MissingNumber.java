package Array;

public class MissingNumber {
	public static void main(String[] args) {
		int []a= {1,2,4,3,9,8,5,6,10};
		int Asum=0;		
		int sum=(10*11)/2;
		
		
		for(int i=0;i<a.length;i++) {
			Asum=Asum+a[i];
		}
		
		int MissingNo=sum-Asum;
		System.out.println(MissingNo);
	}

}
