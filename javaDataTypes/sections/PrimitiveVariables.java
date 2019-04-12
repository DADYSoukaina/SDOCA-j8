package sections;

public class PrimitiveVariables {
	
	// Working with java data types
	
	/**
	 * 1. Primitive data types: Twist In the tale 2.1
	 * 		- Boolean: store true or false
	 * 		- Numeric: Stored as either integers (byte-short-int-long [add l at end of the number]) or decimal (float-double) numbers.
	 * 			- can be stored in: binary(2) -octal(8) prefix: O - decimal(10) prefix: 0b or 0B (default value is double)-hexadecimal(1) prefix: Ox
	 * 			- u can use underscores with the java literal value to make it more readable		
	 * - Character:
	 * 		- Char data can store a single 16-bits Unicode caracter (From \u0000 to \uffff [65,535 ])
	 * 		- unicode value are defined in in the hexadecimal number system.
	 * 		- char data type can be stored as an unsigned integer value.
	 * 		- "u122" (hexadecimal number) 122 (decimal number) 
	 * 
	 * 
	 * 2. Identifiers: Twist In the tale 2.2
	 * 	- valid iddentifier can't use any special character expect ( - ), can't be started with a digits.
	 *
	 * 3. Object reference variable: Twist in the Tale 2.3
	 * 
	 * 4. Operators: Twist In the tale 2.4
	 * 		- Assignment operators
	 * 		- Arithmetic operators
	 * 		- Relational operators
	 * 		- Logical operators
	 * 
	 * 5. Wrapper classes: Twist In the tale 2.5
	 * 		- you can wrap primitives in an object in order to add them to z collection object
	 * 		- all the wrapper classes are immutable
	 * 		- Autoboxing
	 * 		- Unboxing
	 */
	
	
	public static void main(String[] args) {
		/**
		 * Twist in the tale 2.1 (part1): the output is: 534   
		 * Always System.out.print() print the decimal value of the number/ to print the binary number u should use Integer.toBinaryString(0b100001011) [line 51]
		 * 
		 */
//		int baseDecimmal = 267;
//		int octVal = 0413;
//		int hexval = 0x10B;
//		int binVal = 0b100001011;
//		System.out.println(baseDecimmal+octVal); //534
//		System.out.print(hexval + binVal); //534
//		System.out.print(Integer.toBinaryString(binval));
//		
//		
		
		/**
		 * 	Twist in the tale 2.1 (part 2): 
		 * compile error 1: line 55 - under score have to be located within digits.
		 * compile error 2: line 56 - not a valid variable
		 * compile error 3: line 57 - syntax error in token G, hexadecimal can be defined from A to F (Git's not included)
		 * Differenciate between _ to concatain the numbers and make them more readable and - (minos) algorithmic characters 

		 */
		
//	long var1 = 0_100_267_760;
//	long var2 = 0_x_4_13;
//	long var3 = ob_x10_BA_75;
//	long var5 = 0xa10_AG_75;
//	long var6 = 0x1_0000_10;
//	long var7 = 100_12-12;
//		System.out.println(var7);
		
		/**
		 * Twist in the tale 2.2:
		 * 
		 * we cannot convert from int to boolean (b4 = 0;)
		 * boolean = string: invalid character constant 'false'
		 * boolean = string: cannot be resolved to a variable (yes)
		 * 
		 */
		
//		boolean b1, b2, b3, b4, b5, b6;
//		b1 = b2 = b3 = true;
//		b4 = 0;
//		b5 = 'false';
//		b6 = yes;
//		
//		int il;
//		long l2;
//		int l = long 2 = 10;
		
		/**
		 * Twist in the tale 2.3: result 31
		 * 
		 */
		
//		int a=10;
//		a= a++ +a+ --a - --a + a++;
//		System.out.print(a);
		
		/**
		 * Twist in the tale 2.4: evaluating the first operand. AND, OR
		 * 
		 */
//		int a = 10;
//		int b = 20;
//		int c = 40;
//		
//		System.out.println(a++ >10 || ++b<30);
//		System.out.println(a>90 && ++b<30 );
//		System.out.println(!(c>20) && a==10);
//		System.out.println(a>=99 || a<=33 && b==10);
//		System.out.println(a>=99 && a<=33 || b==10);
//	
		
		
		
	}

}
