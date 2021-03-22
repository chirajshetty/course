/*
 * Topic : Working with Methods and Encapsulation
 * Code: 09
 * 
 */

class Transmitter{
	
	private void init () {
		System.out.print("Transmitter Initialized ");
	}

	private void start () {
		init();
		System.out.print("Transmitter Started ");
	}
}



public class Question_11 {

	public static void main(String[] args) {
		Transmitter transmitter = new Transmitter();
//		transmitter.start();		//line 1 
//		transmitter.init();		//line 2 
	}

}

/*
 * What is the result of the following code?
 * 
 * a)
 * Compilation Fail at line 1
 * 
 * b)
 * Transmitter Initialized
 * Transmitter Started 
 * Transmitter Initialized
 *  
 * c)
 * Transmitter Initialized
 * Transmitter Started 
 *  
 * d)
 * Compilation fail at line 2
 * 
 * Answer : 
 * a)
 * Compilation Fail at line 1
 * 
 * Output : 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The method start() from the type Transmitter is not visible
	The method init() from the type Transmitter is not visible

	at Question_11.main(Question_11.java:25)
 * 
 * 
 * Explanation:
 * 
 * The compiler fails at line 1 though the error occurs at both line 1 and 2.
 * The compiler compile the source code and generates bytecode which is independent of platform,
 * the byte code is then checked line by line through interpreter in java.
 * Therefore the first line of error is line 1.
 * 
 * Here the compilation fail occurs because the methods have scope of private. 
 * The methods or data members declared as private are accessible only within the class in which they are declared.
 * 
 * 
 * 
 * Additional Explanation: 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The method start() from the type Transmitter is not visible
	The method init() from the type Transmitter is not visible

	at Question_11.main(Question_11.java:26)
 * 
 * Source : 
 * Actual test 8
 */



