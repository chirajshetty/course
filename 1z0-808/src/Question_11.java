/*
 * NOT COMPLETED 
 * Topic : 
 * Code: 
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
		//transmitter.start();	//line 1 
		//transmitter.init();		//line 2 
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
 * Explanation:
 * 
 * 
 * Additional Explanation: 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The method start() from the type Transmitter is not visible
	The method init() from the type Transmitter is not visible

	at Question_11.main(Question_11.java:26)
 * 
 */



