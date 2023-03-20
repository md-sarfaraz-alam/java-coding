package app_java_2;

import java.io.File;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		
			File f=new File("F://testfiles");
			String[] list = f.list();
			
			for(String str:list) {
				System.out.println(str);
			}
			
			System.out.println(list.length);
		
	}

}

