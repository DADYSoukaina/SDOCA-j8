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
		 * Twist in the tale 2.1:
		 * 
		 * 
		 */
		int baseDecimmal = 267;
		int octVal = 0413;
		int hexval = 0x10B;
		int binVal = 0b100001011;
		System.out.println(baseDecimmal+octVal);
		System.out.print(hexval + binVal);
		
		
		long var1 = 0_100_267_760;
//		long var2 = 0_x_4_13;
//		long var3 = ob_x10_BA_75;
//		long var5 = 0xa10_AG_75;
		long var6 = 0x1_0000_10;
		long var7 = 100__12-12;
//		
		
		
	}

}
