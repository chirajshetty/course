
/*
 * Topic : Java Basics 
 * Code: 01
 * 
 */
public class Question_30 {

	public static void main(int[] args) {
		System.out.println("Main with int " + args[0]);
	}

	public static void main(Object[] args) {
		System.out.println("Main with Object " + args[0]);
	}

	public static void main(String[] args) {
		System.out.println("Main with String " + args[0]);
	}

}

/*
 * Commands : 
 * javac Question_30.java
 * java Question_30 6 1 9
 * 
 * 
 * What is the output of the following program ?
 * 
 * a)
 * Main with String 6
 * 
 * b)
 * Main with Object 6
 *   
 * c)
 * Runtime Exception 
 *  
 * d)
 * Compilation Fails
 *   
 * e)
 * Main with int 6
 *   
 * Answer : 
 * a) Main with String 6
 * 
 * Explanation:
 * This a a classic example of method overloading. Here the main point to note is that the JVM only prefers the main method to be of the format -> public static void main(String args[]), with atleast one string argument.
 * Hence the main method with String array is executed and the output is Main with String 6.  
 *  
 * Additional Explanation: 
 * https://stackoverflow.com/questions/34035646/main-method-with-int-object-and-string-args
 * 
 * Source : 
 * Actual Test 56
 */



