/*
 * NOT COMPLETE
 * Topic : Working with Inheritance 
 * Code: 04
 * 
 */

abstract class Vehicle {
	protected void accelerate() {      // line 1
		
	}
	
	abstract void steer();             // line 2
}

public class Car extends Vehicle {
//	void accelerate() {               // line 3
//		
//	}
	
	protected void steer() {           // line 4
		
	}
}

/*
 * Which two modifications, made independently, enable the code to compile? (Choose any two).
 * 
 * a)
 * Modify method at line 1 to public 
 * 
 * b)
 * Modify method at line 2 to public 
 *  
 * c)
 * Modify method at line 3 to public 
 * 
 * d)
 * Modify method at line 4 to public 
 * 
 * e)
 * Modify method at line 3 to protected 
 * 
 * Answer : 
 * c) and e)
 * Modify method at line 1 to public or protected 
 * 
 * Explanation:
 * The visibility of the method in the subclass must be at least as accessible as the method in the parent class.
 * This rule is not followed by the method void accelerate() and the following modification helps the code to compile.
 * 
 * Additional Explanation: 
 * Abstract Method Definition Rules:
 * 	1. Abstract methods may only be defined in abstract classes.
 * 	2. Abstract methods may not be declared private or final.
 * 	3. Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
 * 	4. Implementing an abstract method in a subclass follows the same rules for overriding a method. For example, the name and signature must be the same, and the visibility of
 * 	the method in the subclass must be at least as accessible as the method in the parent class.
 */
