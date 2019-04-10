package tests;
import static java.lang.Math.*;
import java.lang.Math.*;
import java.lang.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
public class PracticeTestI {
	
	static int i = 2;
	
	public static void main(String[] args) {
		
		/**
		 * 1. Exception thrown: java.lang.ArrayIndexOutOfBoundsException.
		 */
//		int array[] = new int[i];
//		array[1]=66;
//		array[2]=67;
//		
//		System.out.println(array[1]);
		
		
		/**
		 * 2. compilation error at I2d[0][0]= (long[])o: can't convert from long[] to long
		 */
		
//		long[][] I2d;
//		long[] I1d = {1,2,3};
//		Object o=I1d;
//		System.out.print(o);
//		I2d = new long[3][3];
//		System.out.print(I2d);
//		I2d[0][0]= (long[])o;
		
		/**
		 * 3. second parameter of two dimensional array is optional, can be empty
		 */
		
	
		/**
		 * 4. int of three dimensional array
		 */
		
		/**
		 * 5. sort the strings in alphabitics order, start storing the aper cases befor the lower cases
		 */
		
//		String[] strings = {"s","o","u","U","k","K","a"};
//		Arrays.sort(strings);
//		for(String s : strings)
//		System.out.print(s);
		
		/**
		 * 6. Compare two tables (one dimensional int array): true true + compilation error(deepEquals not applicable to (int[],int[]) parameters.
		 */
		
//		int a1[]= {1,2,-3,4,-5,6};
//		int a2[]= {1,2,-3,4,-5,6};
//		System.out.print((a1==a2) + "");
//		System.out.print(Arrays.equals(a1, a2) + "");
//		System.out.print(Arrays.deepEquals(a1, a2)+"");
//		
		
		
		/**
		 * 7. exception/error thrown by JVM: 
		 */
		
		/**
		 * 8. Compilation fails at line 82, unreachable catch block.
		 */
		
//		try {
//			throw method();
//		}catch(IOException e) {
//			System.out.print("caught");
//		}

		/**
		 * 9. 
		 */
		
//		try {
//			 method();
//		}catch(FileNotFoundException fne) {
//			System.out.print("File Not Found Exception fne");
//		}catch(IOException e) {
//			System.out.print("caught");
//		}
		
		
		/**
		 * 10. exception thrown: convert a string to a numeric type but the string dosn't have an appropriate format
		 * Class cast exception
		 */
		
		/**
		 * 11. 
		 */
		
		
		/**
		 * 16.
		 */
		
//		System.out.print(PI);
		
		/**
		 * 19.
		 */
//		System.out.print("main 2");
		
		/**
		 * 20
		 */
//		int x =10;
//		if(x>10) {
//			int y = 20;
//		}
//		else {
//			int y=30;
//		}
//		System.out.print(y);
		
		/**
		 * 21. Duplicate local variable
		 */
		
//		Integer []args = new Integer[2];
		
		/**
		 * 22. 
		 */
		
//		int[] a= {3,2,1,0};
//		int y = a.length;
//		int x = y-1;
//		
//		while(y>=0) {
//			System.out.print(a[--y]);
//		}
		
		/**
		 * 23.
		 */
		
//		String s="A";
//		String c1="A";
//		String c2="B";
//		String c3="C";
//
//		switch(s) {
//		case c1 : {System.out.print("A");};
//		default : {System.out.print("default");};
//		case c2 : {System.out.print("B");};break;
//		case c3 : {System.out.print("C");};
//		if(2=>1)
//			System.out.print("1");
//
//		}
		
		
		
		
		
		
	}
	
	
//	public static void main(String c) {
//		
//	}
//	
//	public static void main(int[] i) {
//		
//	}


//	8. 
//	public static IOException method() {
//		try {
//			return new IOException();
//		}catch(FileNotFoundException e) {
//			return new FileNotFoundException();
//		}
//	}
	
////	9.
//	public static void method() throws IOException {
//		throw new FileNotFoundException();
//	}
	
//		11.
//	public int size(Object obj) {
//		return ((int[])obj).length;
//	}
	
	
	
}
