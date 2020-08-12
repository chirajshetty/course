/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
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
		System.out.println("Ready");

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
 * 
 * 
 * 
 * Additional Explanation: 
 */
