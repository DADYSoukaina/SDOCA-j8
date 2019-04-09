package section;

public class ExecutableJavaApplications {

	/**
	 * JVM start the execution of a java class at particular point at the class:
	 * this point of execution it's main method.
	 *Commande prompt:
	 *Compile code: javac file.java
	 *Execute code: java file
	 *
	 */
	
	public static void main(String ... args) {
		ExecutableJavaApplications object = new ExecutableJavaApplications();
		object.main();
	}
	
	public void main() {
		System.out.println("overloaded main method");
	}
	
	
	/** Twist and the Tale 1.3: 
	 * The answer: a - b
	 */

}
