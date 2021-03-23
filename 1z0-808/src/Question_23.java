/*
 * Topic : Using Operators and Decision Constructs
 * Code: 02
 * 
 */

public class Question_23 {

	public static void main(String[] args) {
		System.out.println(" 9 + 4 = " + 5 + 4);
		System.out.println(" 9 + 4 = " + (5 + 4));
	}

}

/*
 * What is the output of the above ?
 * 
 * a)
 *  9 + 4 = 9
 *  9 + 4 = 9
 * 
 * b)
 *  13 = 9
 *  13 = 9
 *   
 * c)
 *  9 + 4 = 54
 *  9 + 4 = 54
 *   
 * d)
 *  9 + 4 = 54
 *  9 + 4 = 9
 *   
 * Answer : 
 * d)
 *  9 + 4 = 54
 *  9 + 4 = 9
 * 
 * 
 * Explanation:
 * The '+' operator acts as both addition of numbers and string concatenation. 
 * The '+' operator after or before a string with any other data type acts as concatenation where the datatype is converted into string.
 * The '+' between two integer or number datatype acts as a addition operator.
 * 
 * Here in the code the first expression is : " 9 + 4 = " + 5 + 4
 * Starting from the left to right :
 * 	"9 + 4 =" + 5 + 4 --> string + int : string concatenation 
 * 	"9 + 4 = 5" + 4  --> string + int : string concatenation 
 * 	"9 + 4 = 54"
 * 
 * The second expression is : " 9 + 4 = " + (5 + 4)
 * Starting from the left to right :
 * 	"9 + 4 =" + (5 + 4) --> '()' takes precedence over other operators so (5+4) = 9 
 * 	"9 + 4 =" + 9  --> string + int : string concatenation 
 * 	"9 + 4 = 9"  
 * 
 * Additional Explanation: 
 * 
 * Source : 
 * Actual Test 46
 * 
 */


