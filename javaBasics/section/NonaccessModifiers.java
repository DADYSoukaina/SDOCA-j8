package section;

public class NonaccessModifiers {

	/**
	 * Nonaccess modifiers:
	 * abstract, final and static
	 * abstract:
	 * --> Class: - Can't be instantiated.
	 * 			  - may or my not define an abstracty method
	 * --> interface: - is an abstract entity by default
	 * --> method: abstract method don't have a body and it's implemented by drivid class.
	 * --> variables: abstract modifiers with a variable don't compile
	 * final:
	 * --> Class: Final class can't be extended by other class (code won't compile).
	 * --> Interface: can't be marked as finale, it's already abstract.
	 * --> Variable: can't be reassigned a value (don't compile), it's initialized only once, u can use a method to change it's value. 
	 * --> Method: a final method can't be overriden by drived class ( won't compile)
	 * static:
	 * --> Variables: share the same value for all the instances of a class
	 * --> u can't instantiate a top level class or interface as static ( valid only for drived classes inside a class) 
	 * 
	 */
	
}
