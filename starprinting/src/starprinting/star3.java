package starprinting;

public class star3 {
	public static void main(String[] args) {
		 char s='A';
		for(int i=0; i<5; i++) {//row
			for(int j=0; j<5;j++) { //space
				if(s<10) {
				System.out.print("0");
				}
				System.out.print(s++ +" ");

			}
			
			System.out.println();
		}
	}

}
