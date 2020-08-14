/*
 * Topic : Working with Selected classes from the JAVA API 
 * Code: 05
 * 
 */

public class Question_25 {

	public static void main(String[] args) {
		String str = " ";
		str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());
	}

}

/*
 * What is the output of the above ?
 * 
 * a)
 *  true true
 * 
 * b)
 *  true false
 *   
 * c)
 *  false true
 *   
 * d)
 *  false false
 *   
 * Answer : 
 * d)
 * false false
 * 
 * 
 * Explanation:
 * This question is trying to see if you know that String objects are immutable. 
 * The line str.trim() returns "" removing the whitespaces but the result is ignored and not stored in the str.
 * The line str.equals compare "" with "  ". Note that for Java, whitespaces are characters like spaces, tabs and so on.
 * Therefore the it is false.
 * The call for the method str.isEmpty() is also false for the same reason that the whitesspaces are consider as characters. 
 * "" on the other hand is true because it contains string of no length.	  
 * 
 * Additional Explanation: 
 * https://www.baeldung.com/java-blank-empty-strings#:~:text=We%20consider%20a%20string%20to,Have%20a%20look%20at%20Character.
 */



