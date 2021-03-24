 /*
 * NOT COMPLETED 
 * Topic : Handling Exception
 * Code: 010
 * 
 */

import java.util.ArrayList;

public class Question_28 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		String[] myArray;
		try {
			while(true) {
				arr.add("String");
			}
		}
		catch (RuntimeException re) {
			System.out.println("Caught a RuntimeException ");
		}
		catch (Exception re) {
			System.out.println("Caught a Exception ");
		}
		System.out.println("Ready"+arr);
	}
}

/*
 * What is the output of the above ?
 * 
 * a)
 * Execution terminates in the first catch statement, and Caught a RuntimeException is printed to the console.
 * 
 * b)
 *	Execution terminates in the second catch statement, and Caught an Exception is printed to the console.
 *
 * c)
 * A runtime error is thrown in the thread "main"
 *   
 * d)
 * Execution completes normally, and Ready to use is printed to the console.
 * 
 * e)
 * The code fails to compile because a throws keyword is required.	
 *   
 * Answer : 
 * c)
 * A runtime error is thrown in the thread "main"
 * 
 * 
 * Explanation:
 * The real issue arises in while loop. The while statement has condition set to true, hence creating an infinite loop.
 * The infinite loop causes the arrraylist "arr" to store "String" infinite times in the memory. This throws an OutOfMemoryError which is a runtime error and cannot be caught by catch block.
 * The following code fails at runtime and throws an error, hence option -> C)A runtime error is thrown in the thread "main" <- is the only correct.
 * 
 * 
 * 
 * Additional Explanation: 
 * 
 * Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.
 * Java new generic collection allows you to have only one type of object in a collection. Now it is type safe so typecasting is not required at runtime.
 * Let's see the old non-generic example of creating java collection.
 * 
 * ArrayList list=new ArrayList();//creating old non-generic arraylist  
 * 
 * Let's see the new generic example of creating java collection.
 * 
 * ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist  
 * 
 * In a generic collection, we specify the type in angular braces. Now ArrayList is forced to have the only specified type of objects in it. If you try to add another type of object, it gives compile time error.
 *
 *
 *Source :
 *Actual Test 45 
 *
 */
