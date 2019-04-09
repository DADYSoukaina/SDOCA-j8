package section;

//public class TheStructuresOfAJavaClassAndJavaSourceCodeFile {
// /** Java class -> java source code file (.java) -> java bytecode file (.class)
//  * 
//  */
//}
/** Twist and the Tale 1.1: 
 * The answer: c - d
 * A java source code file can define multiple classes and interfaces.
 * The below code will fail to compile because the interface is with public access modifier and not match the java code file name
 * In a java file code we should have only one public class or interface and it's matching the name of the class.
 */
//public interface Printable{  
//Fail to compile
//}

interface Movable{
	//Success
}

/** Twist and the Tale 1.2: 
 * The answer: a - c - d
 * Two public components (inerface and class) in a java source code file
 * Only one public class should be declarated in java code file
 */

	interface printable{
	}
	
	class MyClass{
	}
	
//	interface Movable{	
	//Fail to compile
//	}
	
//	public class Car{
//	}
	
	public interface TheStructuresOfAJavaClassAndJavaSourceCodeFile{
	//success	
	}